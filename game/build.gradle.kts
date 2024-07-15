group = "com.client"
version = "0.0.3"

dependencies {
    implementation(project(":runelite"))

    implementation("org.slf4j:slf4j-api:1.7.25")
    implementation("com.google.guava:guava:30.0-android")
    implementation("ch.qos.logback:logback-classic:1.2.9")
    implementation("commons-io:commons-io:2.7")
    implementation("org.apache.commons:commons-lang3:3.9")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.12.7.1")
    implementation("com.dorkbox:Notify:3.7")
    implementation("com.google.code.gson:gson:2.8.9")

    // https://mvnrepository.com/artifact/org.locationtech.jts/jts-core
    implementation("org.locationtech.jts:jts-core:1.19.0")


    // https://github.com/aschoerk/reflections8
    implementation("net.oneandone.reflections8:reflections8:0.11.7")

    implementation("com.displee:rs-cache-library:6.9")
    implementation("io.netty", "netty-buffer", "4.1.79.Final")
    implementation("one.util:streamex:0.8.1")
    implementation("org.apache.commons:commons-compress:1.21")
    implementation("org.tukaani:xz:1.9")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2")
    implementation("com.squareup.okhttp3:okhttp:4.9.3")

    // Jackson
    implementation("com.fasterxml.jackson.core:jackson-core:2.8.6")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.12.7.1")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.8.6")
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("com.googlecode.json-simple:json-simple:1.1.1")
    implementation("javax.xml.bind:jaxb-api:2.3.1")
    implementation(group = "com.google.inject", name = "guice", version = "5.0.1")
    implementation(group = "org.bouncycastle", name = "bcprov-jdk15on", version = "1.52")

    // https://mvnrepository.com/artifact/me.tongfei/progressbar
    implementation("me.tongfei:progressbar:0.9.5")
    implementation("org.jetbrains:annotations:24.0.0")

    implementation(group = "net.java.dev.jna", name = "jna", version = "5.9.0")

    implementation("org.apache.commons:commons-text:1.8")

    // https://mvnrepository.com/artifact/com.thoughtworks.xstream/xstream
    implementation("com.thoughtworks.xstream:xstream:1.4.20")

    implementation("org.reflections:reflections:0.10.2")
    implementation("it.unimi.dsi:fastutil:8.5.13")


    val lombok = module("org.projectlombok", "lombok", "1.18.26")
    compileOnly(lombok)
    annotationProcessor(lombok)
    testCompileOnly(lombok)
    testAnnotationProcessor(lombok)
}

application {
    mainClass.set("Application")
}

tasks {
    register<JavaExec>("Run-Normal") {
        group = "Runelite"
        description = "Run Runelite in Normal Mode"
        classpath = project.sourceSets.main.get().runtimeClasspath
        mainClass.set("Application")
        args = listOf("--developer-mode")
    }

    register<JavaExec>("Run-Development") {
        group = "Runelite"
        description = "Run Runelite in Development Mode"
        enableAssertions = true
        args = listOf("--developer-mode")
        classpath = project.sourceSets.main.get().runtimeClasspath
        mainClass.set("Application")
    }
}