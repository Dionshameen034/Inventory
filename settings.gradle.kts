@file:Suppress("UnstableApiUsage")

/*
Ailyn Diaz
4/19/24
CSC ANDROID: ROOM DATABASE
*/

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "Inventory"
include(":app")
