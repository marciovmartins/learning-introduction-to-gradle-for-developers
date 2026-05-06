plugins {
    id("java-library")
}

repositories {
    mavenCentral()
}

dependencies {
    api("com.google.guava:guava:32.1.2-jre")

    testRuntimeOnly("org.junit.platform:junit-platform-launcher:1.10.0")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

tasks.named<JavaCompile>("compileJava") {
//    options.isDebug = false
}