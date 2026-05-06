plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
    id("org.barfuin.gradle.taskinfo") version "3.0.2"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":model"))
    implementation(libs.guava)

    testImplementation("org.junit.jupiter:junit-jupiter-api:6.0.1")

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
}

application {
    mainClass = "org.example.App"
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

tasks.named<JavaCompile>("compileJava") {
//    options.isDebug = false
}