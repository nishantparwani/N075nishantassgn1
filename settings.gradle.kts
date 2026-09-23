pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
<<<<<<< HEAD
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}
=======
>>>>>>> upstream/master
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

<<<<<<< HEAD
rootProject.name = "N075nishantassgn1"
=======
rootProject.name = "GeminiApiComposeStarter"
>>>>>>> upstream/master
include(":app")
 