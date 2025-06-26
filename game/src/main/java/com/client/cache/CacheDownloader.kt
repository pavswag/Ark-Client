package com.client.cache

import com.client.Client
import com.client.Configuration
import com.client.js5.disk.ArchiveDisk
import com.client.sign.Signlink
import kotlinx.coroutines.*
import okhttp3.OkHttpClient
import okhttp3.Request
import org.json.simple.JSONArray
import org.json.simple.JSONObject
import org.json.simple.parser.JSONParser
import java.io.*
import java.net.SocketTimeoutException
import java.net.URL
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.security.MessageDigest
import java.text.SimpleDateFormat
import java.util.Date
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import java.util.zip.ZipInputStream
import javax.xml.bind.DatatypeConverter
import kotlin.system.exitProcess
import kotlin.system.measureTimeMillis

class CacheDownloader(
    val path: String,
    val url: String,
    var updateCheck: Boolean = true,
    val writeOnlineHash: Boolean = false,
    private val listener: Progress? = object : Progress() {
        override fun update(progress: Int, message: String) {
            print("\r [$progress] $message")
        }
    }
) {
    private val client = OkHttpClient.Builder()
        .connectTimeout(60, TimeUnit.SECONDS)
        .writeTimeout(60, TimeUnit.SECONDS)
        .readTimeout(60, TimeUnit.SECONDS)
        .addInterceptor { chain ->
            val request = chain.request().newBuilder()
                .addHeader("Accept-Encoding", "gzip, deflate, br")
                .build()
            chain.proceed(request)
        }
        .connectionPool(okhttp3.ConnectionPool(5, 5, TimeUnit.MINUTES))
        .build()

    private val coroutineScope = CoroutineScope(Executors.newFixedThreadPool(8).asCoroutineDispatcher())
    private val deferredTasks = mutableListOf<Deferred<Unit>>()
    private var totalBytesDownloaded = 0L
    private var totalFilesSize = 0L

    var update: MutableList<String> = mutableListOf()

    init {
        if (writeOnlineHash) {
            updateCheck = false
            writeHashes()
        } else {
            runBlocking {
                val totalTimeMillis = measureTimeMillis {
                   initialize()
                }
                val summary = createDownloadSummary(totalTimeMillis)
                println(summary)
                logDownloadSummary(summary)
            }
        }
    }

    private suspend fun initialize() {
        listener?.update(0, "Looking for Updates...")

        if (updateFiles() && updateCheck) {
            listener?.update(0, "Updates found...")
            generateList()

            // Calculate total size of all files to be downloaded
            update.forEach {
                val fileUrl = url + it
                totalFilesSize += getContentLength(fileUrl)
            }

            update.forEach {
                deferredTasks.add(coroutineScope.async {
                    val fileUrl = url + it
                    val filePath = path + it
                    val contentLength = getContentLength(fileUrl)

                    if (contentLength >= 100 * 1024 * 1024) {
                        // Use chunked download for files 100MB or larger
                        downloadFileInChunks(fileUrl, filePath)
                    } else {
                        // Use regular download for smaller files
                        downloadFile(fileUrl, filePath)
                    }
                })
            }

            deferredTasks.awaitAll()

            recheckAndDownloadMissingFilesAsync()
            handleSpecialFilesPostDownload()
            writeHashes()
            Signlink.init(26)
            Signlink.masterDisk = ArchiveDisk(255, Signlink.cacheData, Signlink.cacheMasterIndex, 500000)
        }
    }

    private fun getContentLength(fileUrl: String): Long {
        val request = Request.Builder().url(fileUrl).head().build()
        client.newCall(request).execute().use { response ->
            return response.body?.contentLength() ?: 0
        }
    }

    private suspend fun downloadFileInChunks(url: String, path: String, chunkSize: Long = 5 * 1024 * 1024) {
        val request = Request.Builder().url(url).build()
        client.newCall(request).execute().use { response ->
            if (!response.isSuccessful) throw IOException("Unexpected code $response")
            val contentLength = response.body?.contentLength() ?: 0
            val numChunks = (contentLength / chunkSize).toInt() + 1

            val deferredChunks = (0 until numChunks).map { chunkIndex ->
                coroutineScope.async {
                    val start = chunkIndex * chunkSize
                    val end = if (chunkIndex == numChunks - 1) contentLength - 1 else (chunkIndex + 1) * chunkSize - 1
                    downloadChunk(url, path, start, end, chunkIndex)
                }
            }

            deferredChunks.awaitAll()

            // After all chunks are downloaded, combine them
            combineChunks(path, numChunks)
        }
    }

    private suspend fun downloadChunk(url: String, path: String, start: Long, end: Long, chunkIndex: Int, retries: Int = 3) {
        var attempts = 0
        while (attempts < retries) {
            try {
                val request = Request.Builder()
                    .url(url)
                    .addHeader("Range", "bytes=$start-$end")
                    .build()

                client.newCall(request).execute().use { response ->
                    if (response.code == 416) {
                        // Handle the 416 error by attempting to download the entire file
                        handle416Error(url, path, chunkIndex)
                        return
                    }

                    if (!response.isSuccessful) throw IOException("Unexpected code $response")

                    val chunkPath = "$path.part$chunkIndex"
                    val bytesDownloaded = response.body?.byteStream()?.use { inputStream ->
                        BufferedOutputStream(FileOutputStream(chunkPath), 128 * 1024).use { fos ->
                            inputStream.copyTo(fos)
                        }
                    } ?: 0L

                    totalBytesDownloaded += (end - start + 1)  // Ensure that the exact bytes are counted.
                }
                return // Exit the function if the download was successful
            } catch (e: SocketTimeoutException) {
                attempts++
                if (attempts >= retries) {
                    throw e // Rethrow the exception if we've exhausted the retries
                }
                delay(1000L * attempts) // Exponential backoff
            } catch (e: IOException) {
                attempts++
                if (attempts >= retries) {
                    throw e
                }
                delay(1000L * attempts)
            }
        }
    }

    private suspend fun handle416Error(url: String, path: String, chunkIndex: Int) {
        // Attempt to download the file without using the range header
        val request = Request.Builder()
            .url(url)
            .build()

        client.newCall(request).execute().use { newResponse ->
            if (!newResponse.isSuccessful) throw IOException("Unexpected code $newResponse")

            val chunkPath = "$path.part$chunkIndex"
            val bytesDownloaded = newResponse.body?.byteStream()?.use { inputStream ->
                BufferedOutputStream(FileOutputStream(chunkPath), 128 * 1024).use { fos ->
                    inputStream.copyTo(fos)
                }
            } ?: 0L

            totalBytesDownloaded += bytesDownloaded
        }
    }

    private suspend fun downloadFile(url: String, path: String) {
        val request = Request.Builder().url(url).build()
        client.newCall(request).execute().use { response ->
            if (!response.isSuccessful) throw IOException("Unexpected code $response")
            val bytesDownloaded = response.body?.byteStream()?.use { inputStream ->
                BufferedOutputStream(FileOutputStream(path), 128 * 1024).use { fos ->
                    inputStream.copyTo(fos)

                }
            } ?: 0L

            totalBytesDownloaded += bytesDownloaded
        }
    }

    private fun combineChunks(path: String, numChunks: Int) {
        FileOutputStream(path).use { fos ->
            (0 until numChunks).forEach { chunkIndex ->
                val chunkPath = "$path.part$chunkIndex"
                FileInputStream(chunkPath).use { fis ->
                    fis.copyTo(fos)
                }
                File(chunkPath).delete()
            }
        }
    }

    private suspend fun recheckAndDownloadMissingFilesAsync() {
        val jsonParser = JSONParser()
        val link = URL(url + "online_hashes.json")
        val inputStream = link.openStream().bufferedReader().use { it.readText() }
        val obj = jsonParser.parse(inputStream) as JSONArray

        val missingFiles = obj.mapNotNull {
            val data = (it as JSONObject)["data"] as JSONObject
            val name = data["name"] as String
            val hash = data["hash"] as String
            val location = data["location"] as String
            if (needsDownload(location, hash) && name != "hashes.json") {
                location
            } else {
                null
            }
        }

        if (missingFiles.isNotEmpty()) {
            listener?.update(0, "Rechecking and downloading missing files...")
            missingFiles.forEach {
                deferredTasks.add(coroutineScope.async {
                    val fileUrl = url + it
                    val filePath = path + it
                    val contentLength = getContentLength(fileUrl)

                    if (contentLength >= 100 * 1024 * 1024) {
                        // Use chunked download for files 100MB or larger
                        downloadFileInChunks(fileUrl, filePath)
                    } else {
                        // Use regular download for smaller files
                        downloadFile(fileUrl, filePath)
                    }
                })
            }
            deferredTasks.awaitAll()
            listener?.update(100, "Recheck and download complete")
        } else {
            listener?.update(100, "No missing files found")
        }
    }

    private fun generateList() {
        listener?.update(0, "Generating Patch List...")
        val jsonParser = JSONParser()
        val link = URL(url + "online_hashes.json")
        val inputStream = link.openStream().bufferedReader().use { it.readText() }
        val list = jsonParser.parse(inputStream) as JSONArray

        list.forEach {
            val data = (it as JSONObject)["data"] as JSONObject
            val name = data["name"] as String
            val hash = data["hash"] as String
            val location = data["location"] as String
            if (needsDownload(location, hash) && name != "hashes.json") {
                update.add(location)
            }
        }
        listener?.size = update.size
    }

    private fun needsDownload(location: String, hash: String): Boolean {
        val file = File(path, location)
        return !file.exists() || getHash(file.toPath()) != hash
    }

    private fun updateFiles(): Boolean {
        val localHashFile = File(path, "hashes.json")
        return if (!localHashFile.exists()) {
            true
        } else {
            getOnlineHash(URL(url + "online_hashes.json")) != getHash(localHashFile.toPath())
        }
    }

    private fun getOnlineHash(url: URL): String {
        val request = Request.Builder().url(url).build()
        client.newCall(request).execute().use { response ->
            if (!response.isSuccessful) throw IOException("Unexpected code $response")
            return response.body?.string() ?: throw IOException("Empty response body")
        }
    }

    private fun getHash(file: Path): String {
        val md = MessageDigest.getInstance("MD5")
        md.update(Files.readAllBytes(file))
        return DatatypeConverter.printHexBinary(md.digest()).toLowerCase()
    }

    private fun handleSpecialFiles(file: String) {
        when (file) {
            "sprites.zip" -> File(path, "sprites").deleteRecursively()
            "sounds.zip" -> File(path, "sounds").deleteRecursively()
        }
    }

    private fun handleSpecialFilesPostDownload() {
        val spritesZipFile = File(path, "sprites.zip")
        if (spritesZipFile.exists() && !File(path, "sprites").exists()) {
            checkAndExtractZip("sprites.zip", ".")
        }

        val soundsZipFile = File(path, "sounds.zip")
        if (soundsZipFile.exists() && !File(path, "sounds").exists()) {
            checkAndExtractZip("sounds.zip", ".")
        }
    }

    fun checkAndExtractZip(zipFileName: String, outputDirectoryName: String) {
        val zipFile = File(path, zipFileName)
        if (zipFile.exists()) {
            println("Extracting $zipFileName")
            val outputDirectory = File(path, outputDirectoryName)
            extractZipFile(zipFile, outputDirectory)
        }
    }

    private fun extractZipFile(zipFile: File, outputDirectory: File) {
        ZipInputStream(FileInputStream(zipFile)).use { zipStream ->
            var entry = zipStream.nextEntry
            while (entry != null) {
                val entryFile = File(outputDirectory, entry.name)
                if (entry.isDirectory) {
                    entryFile.mkdirs()
                } else {
                    entryFile.parentFile.mkdirs()
                    FileOutputStream(entryFile).use { fos ->
                        zipStream.copyTo(fos)
                    }
                }
                entry = zipStream.nextEntry
            }
        }
    }

    private fun writeHashes() {
        val list = JSONArray()
        val rootPath = Paths.get(path)
        Files.walk(rootPath)
            .filter { !Files.isDirectory(it) }
            .filter { file ->
                val fileName = file.fileName.toString()
                val parentDir = file.parent?.toString()
                val isExcludedDir = parentDir?.contains("sprites") == true ||
                        parentDir?.contains("okhttp") == true ||
                        parentDir?.contains("error_logs") == true ||
                        parentDir?.contains("sounds") == true
                val isExcludedFile = fileName == "hashes.json" ||
                        fileName == "accounts.dat" ||
                        fileName == "uid.dat"
                !isExcludedDir && !isExcludedFile
            }
            .forEach {
                val data = JSONObject()
                data["name"] = it.fileName.toString()
                data["location"] = rootPath.relativize(it).toString().replace("\\", "/")
                data["hash"] = getHash(it)
                val write = JSONObject()
                write["data"] = data
                list.add(write)
            }
        try {
            FileWriter(if (writeOnlineHash) "online_hashes.json" else path + "hashes.json").use { file ->
                file.write(list.toJSONString())
                file.flush()
            }
        } catch (IOException: IOException) {
            IOException.printStackTrace()
        }
        if (writeOnlineHash) {
            exitProcess(0)
        }
    }

    private fun createDownloadSummary(totalTimeMillis: Long): String {
        val totalTimeSeconds = totalTimeMillis / 1000.0
        val totalMegabytes = totalBytesDownloaded / (1024.0 * 1024.0)
        val downloadSpeed = totalMegabytes / totalTimeSeconds

        return """
            Download Summary:
            Total size downloaded: %.2f MB
            Total time taken: %.2f seconds
            Average download speed: %.2f MB/s
        """.trimIndent().format(totalMegabytes, totalTimeSeconds, downloadSpeed)
    }

    private fun logDownloadSummary(summary: String) {
        val errorLogDirectory = Client.getErrorLogDirectory()
        val errorLogFile = File(errorLogDirectory, Configuration.ERROR_LOG_FILE)
        errorLogFile.parentFile.mkdirs() // Ensure that the directory exists
        errorLogFile.appendText(summary + "\n\n")
    }

    fun awaitCompletion() {
        runBlocking {
            deferredTasks.awaitAll()
        }
    }
}

