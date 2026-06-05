plugins {
    id("java-library")
}

repositories {
    mavenCentral()
}

dependencies {
    api(libs.guava)

    testRuntimeOnly(libs.junit.platform.launcher)
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

tasks.named<JavaCompile>("compileJava") {
//    options.isDebug = false
}

tasks.register<PrintString>("printGoodbye") {
    description = "Prints goodbye"
    str = "goodbye!"
}