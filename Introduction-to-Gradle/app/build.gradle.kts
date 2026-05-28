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
    implementation(libs.google.http.client)

    testImplementation(libs.junit.jupiter)
    testImplementation(libs.bundles.mockito)

    testRuntimeOnly(libs.junit.platform.launcher)
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

abstract class HelloTask : DefaultTask() {
    // @Input var str: String = "hello world!"

    // Lazy load
    @get:Input
    abstract val str: Property<String>

    init {
        str.convention("hello world!")
    }


    @TaskAction
    fun action() {
        println(str.get())
    }
}

tasks.register<HelloTask>("hello") {
    description = "Prints a Hello World greeting."
    str = "hi there!"
}