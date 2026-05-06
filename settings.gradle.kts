plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
    id("com.autonomousapps.build-health") version "3.10.0"
}

rootProject.name = "introduction-to-gradle-for-developers"
include("model", "app")
