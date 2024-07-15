package com.client.cache

import com.client.js5.disk.ArchiveDisk
import com.client.sign.Signlink
import kotlinx.coroutines.*
import okhttp3.OkHttpClient
import okhttp3.Request
import org.json.simple.JSONArray
import org.json.simple.JSONObject
import org.json.simple.parser.JSONParser
import java.io.*
import java.net.URL
import java.nio.file.Files
import java.nio.file.Path
import java.security.MessageDigest
import javax.swing.JOptionPane
import javax.xml.bind.DatatypeConverter
import kotlin.system.exitProcess
import java.nio.file.Paths
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import java.util.zip.ZipInputStream

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
    private val client = OkHttpClient().newBuilder()
        .connectTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .build()
    private val coroutineScope = CoroutineScope(Executors.newFixedThreadPool(4).asCoroutineDispatcher())
    private val deferredTasks = mutableListOf<Deferred<Unit>>()

    var update: MutableList<String> = mutableListOf()

    init {
        if (writeOnlineHash) {
            updateCheck = false
            writeHashes()
        }
        initialize()
    }

    private fun initialize() {
        listener?.update(0, "Looking for Updates...")

        if (updateFiles() && updateCheck) {
            listener?.update(0, "Updates found...")
            generateList()
            runBlocking {
                update.forEach {
                    val deferred = coroutineScope.async {
                        downloadAsync(url + it, path + it)
                    }
                    deferredTasks.add(deferred)
                    handleSpecialFiles(it)
                }

                deferredTasks.awaitAll()

                recheckAndDownloadMissingFilesAsync()
                handleSpecialFilesPostDownload()
            }
            writeHashes()
            Signlink.init(26)
            Signlink.masterDisk = ArchiveDisk(255, Signlink.cacheData, Signlink.cacheMasterIndex, 500000)
        }
    }

    private suspend fun downloadAsync(url: String, path: String) {
        val deferred = coroutineScope.async {
            download(url, path)
        }
        deferred.await()
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
                val deferred = coroutineScope.async {
                    downloadAsync(url + it, path + it)
                }
                deferredTasks.add(deferred)
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

    private fun download(name: String, path: String) {
        val request = Request.Builder().url(name.replace(" ", "%20")).build()
        client.newCall(request).execute().use { response ->
            if (!response.isSuccessful) throw IOException("Unexpected code $response")

            val contentLength = response.body?.contentLength() ?: 0
            val inputStream = response.body?.byteStream() ?: throw IOException("Empty response body")

            File(path.substringBeforeLast("/")).mkdirs()
            BufferedOutputStream(FileOutputStream(path)).use { outputStream ->
                val buffer = ByteArray(8192)
                var bytesRead: Int
                var downloaded = 0L

                while (inputStream.read(buffer).also { bytesRead = it } != -1) {
                    outputStream.write(buffer, 0, bytesRead)
                    downloaded += bytesRead
                    listener?.fileName = name.substringAfterLast("/")
                    listener?.link = name
                    listener?.update(((downloaded * 100) / contentLength).toInt(), "Downloading ${name.substringAfterLast('/')}")
                }
            }
        }
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
        } catch (e: IOException) {
            e.printStackTrace()
        }
        if (writeOnlineHash) {
            exitProcess(0)
        }
    }

    fun awaitCompletion() {
        runBlocking {
            deferredTasks.awaitAll()
        }
    }
}
