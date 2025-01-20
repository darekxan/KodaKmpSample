enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven(
            url = "https://europe-maven.pkg.dev/kodaai-mobile-sdk/kotlin-sdk"
        )
    }
}

rootProject.name = "KodaKmpSample"
include(":androidApp")
include(":shared")