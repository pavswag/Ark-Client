import dev.openrune.settings.BootstrapPluginExtension
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import proguard.gradle.ProGuardTask
import java.security.MessageDigest
import kotlin.random.Random

plugins {
    kotlin("jvm") version "1.8.22"
    application
    id("com.github.johnrengelman.shadow") version "8.1.1"
    id("dev.openrune.bootstrap") version "1.4"
}



buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("com.guardsquare:proguard-gradle:7.3.0")
    }
}

allprojects {
    apply(plugin = "kotlin")
    apply(plugin = "application")
    apply(plugin = "com.github.johnrengelman.shadow")

    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = JavaVersion.VERSION_11.toString()
    }

    java {
        setSourceCompatibility(JavaVersion.VERSION_11.toString())
        setTargetCompatibility(JavaVersion.VERSION_11.toString())
    }
}

dependencies {
    implementation(project("game"))
}

tasks.register<Jar>("createJar") {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE

    dependsOn(project(":game").tasks["jar"], project(":runelite").tasks["jar"])

    doFirst {
        configurations["runtimeClasspath"].forEach { file ->
            if (file.name.endsWith(".jar")) {
                from(zipTree(file.absolutePath))
            }
        }
    }

    manifest {
        attributes(
            "Main-Class" to "Application"
        )
    }

    archiveBaseName.set("client-raw")
    destinationDirectory.set(file("${rootProject.buildDir}/tmp"))
}


tasks.register("generateObfuscationDictionaries") {
    doLast {
        println("Running generate task...")

        val similarCharPairs = listOf(
            // Single Characters
            "l1", "Il", "iI", "1I", "Ii", "lI", "i1", "I1", "11", "ii",
            "li", "il", "Li", "lL", "iL", "1l", "L1", "Il", "i1", "1l",
            "lJ", "Ij", "Ji", "J1", "Jj", "j1", "J1", "JJ", "jj",
            "Ji", "iJ", "Li", "lL", "iL", "1j", "Ij", "iJ", "1J", "l1J",
            "Lt", "tL", "Tf", "fr", "Rr", "Lr", "Tr", "rL", "tT", "Tt",
            "Rf", "fT", "ft", "Rt", "Fr", "Tj", "jt", "fR", "rF",
            "A4", "4A", "S5", "5S", "O0", "0O", "B8", "8B",

            // Double Characters
            "ll", "II", "ii", "LL", "ll", "ii", "11", "Ii", "li", "Il",
            "1i", "i1", "lI", "I1", "ij", "ji", "lJ", "Jl", "iJ", "Ji",
            "Jj", "jJ", "JJ", "jj", "Li", "il", "1j", "j1", "Ll", "ll",
            "l1", "1l", "1L", "L1", "1J", "Jl", "Lj", "jL", "Li", "iL",
            "Lf", "fL", "Tr", "rT", "Lt", "tL", "Tf", "fT", "Rr", "rR",
            "Fr", "rF", "ft", "tf", "Rt", "tR", "Fr", "rF", "Tt", "tT",
            "Rj", "jR", "Tj", "jT", "Lf", "fL", "Rt", "tR", "J1", "1J",
            "4A", "A4", "S5", "5S", "O0", "0O", "B8", "8B",

            // Triple Characters
            "lll", "III", "iii", "LLL", "lll", "iii", "111", "iIi", "lil", "iIl",
            "1ii", "ii1", "lII", "II1", "ijj", "jji", "lJJ", "Jjl", "iJJ", "Jii",
            "JJj", "jjJ", "JJJ", "jjj", "Lii", "iil", "1jj", "jj1", "Lll", "lll",
            "l11", "11l", "1LL", "LL1", "1JJ", "JJl", "Ljj", "jjL", "Lii", "iiL",
            "Lff", "ffL", "Trr", "rrT", "Ltt", "ttL", "Tff", "ffT", "Rrr", "rrR",
            "Frr", "rrF", "fft", "ttf", "Rtt", "ttr", "Frr", "rrF", "Ttt", "ttT",
            "Rjj", "jjR", "Tjj", "jjT", "Lff", "ffL", "Rtt", "ttr", "JJ1", "11J",
            "44A", "A44", "55S", "S55", "00O", "O00", "88B", "B88",

            // Mixed Case
            "llI", "IIl", "iiI", "LLi", "lLI", "iiL", "I1i", "I1L", "1iI", "iIl",
            "iI1", "I1l", "IjI", "JiJ", "lJi", "iJl", "JiL", "LiJ", "J1i", "Jil",
            "JjJ", "jiJ", "iJl", "lJi", "lJ1", "J1l", "JIl", "Ili", "iJ1", "1Ji",
            "llL", "L1L", "lJL", "J1L", "J1i", "i1J", "JJ1", "1JJ", "JJJ", "jJ1",
            "jjJ", "jJj", "Jj1", "1jJ", "LJi", "JiL", "J1j", "j1J", "1iJ", "Ji1",
            "i1L", "Lii", "LfL", "fLl", "rTT", "Trr", "tTT", "ttL", "Tft", "Tff",
            "Rff", "FrR", "ftR", "fRR", "RtR", "FfR", "tRf", "tFR", "Tjr", "tRT",
            "Rjt", "jjT", "Tjj", "LfT", "jTR", "1tR", "ttJ", "Tt1", "Rtt", "t1R"
        )

        fun generateRandomString(length: Int, charList: List<Char>): String {
            return (1..length)
                .map { charList.random() }
                .joinToString("")
        }

        fun generateUniqueStrings(count: Int, pairCount: Int): Set<String> {
            val uniqueStrings = mutableSetOf<String>()
            val random = Random.Default

            // Generate strings with more randomness
            while (uniqueStrings.size < count) {
                val length = pairCount + random.nextInt(5) // Adding some variation in length
                val pairs = (1..length)
                    .map { similarCharPairs.random() }
                    .joinToString("")
                    .toList()
                    .shuffled()
                    .joinToString("")
                uniqueStrings.add(pairs)
            }

            return uniqueStrings
        }

        val baseDir = File("proguard")
        if (!baseDir.exists()) {
            baseDir.mkdirs()
        }

        val fileNames = listOf(
            "class_obfuscation_dictionary.txt",
            "obfuscation_dictionary.txt",
            "package_obfuscation_dictionary.txt"
        )

        fileNames.forEach { fileName ->
            val uniqueStrings = generateUniqueStrings(100, 100)

            val file = File(baseDir, fileName)
            file.printWriter().use { writer ->
                uniqueStrings.forEach {
                    println("Writing to file: $it")
                    writer.println(it)
                }
            }

        }
    }
}



tasks.register<ProGuardTask>("buildGame") {
    group = "build"
    dependsOn("createJar", "generateObfuscationDictionaries")

    val inJar = layout.buildDirectory.file("tmp/client-raw.jar")
    val outJar = layout.buildDirectory.file("client-all.jar")

    val proguardConf = file("proguard/proguard.conf")

    injars(inJar.get().asFile.absolutePath)
    outjars(outJar.get().asFile.absolutePath)

    configuration(proguardConf)

    configurations.runtimeClasspath.get().forEach {
        libraryjars(it.absolutePath)
    }

    val jmods = listOf(
        "java.base", "java.datatransfer",
        "java.desktop", "java.management",
        "jdk.jfr", "java.logging"
    )
    val jdkHome = System.getProperty("java.home")

    jmods.forEach {
        libraryjars("$jdkHome/jmods/$it.jmod")
    }

    printmapping("obfuscation_map.txt")

    doLast {
        println("Hash: ${calculateMd5(outJar.get().asFile.absolutePath)}")
    }
}

fun calculateMd5(filePath: String): String {
    val file = File(filePath)
    val digest = MessageDigest.getInstance("MD5")
    file.inputStream().use { fis ->
        val buffer = ByteArray(8192)
        var read: Int
        while (fis.read(buffer).also { read = it } != -1) {
            digest.update(buffer, 0, read)
        }
    }
    val md5sum = digest.digest()
    return md5sum.joinToString("") { "%02x".format(it) }
}

tasks.withType<JavaCompile>().configureEach {
    options.isWarnings = false
    options.isDeprecation = false
    options.isIncremental = true
}

tasks {
    jar {
        destinationDirectory.set(file("${rootProject.buildDir}\\"))
    }
}

configure<BootstrapPluginExtension> {
    downloadRoot.set("https://swiftpkrsps.com/repo/client/")
    buildType = "beta"

    ftp {
        ftpServer = System.getenv("FTP_HOST") ?: ""
        ftpUser = System.getenv("FTP_USERNAME") ?: ""
        ftpPassword = System.getenv("FTP_PASSWORD") ?: ""
    }
}