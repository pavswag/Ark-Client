rootProject.name = "Ark-Client"

dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        mavenCentral()
        maven("https://repo.runelite.net")
        maven("https://jitpack.io")
        maven("https://nexus.motechproject.org/content/repositories/releases/")
    }
}

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://jitpack.io")
        maven("https://raw.githubusercontent.com/OpenRune/hosting/master")
    }
}

include("game","runelite")