plugins {
    id("java-library")
}

repositories {
    mavenCentral()
}

dependencies {
    api(libs.guava)

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

tasks.named<JavaCompile>("compileJava") {
//    options.isDebug = false
}