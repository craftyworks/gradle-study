plugins {
    kotlin("jvm") version "1.3.61"
    war
    id("org.gretty") version "2.2.0"
}

repositories {
    jcenter()
}

dependencies {
    providedCompile("javax.servlet:javax.servlet-api:3.1.0")
    implementation(kotlin("stdlib"))
    testCompile("junit:junit:4.12")
    testCompile("org.mockito:mockito-core:2.7.19")
    testCompile("io.github.bonigarcia:webdrivermanager:1.6.1")
    testCompile("org.seleniumhq.selenium:selenium-java:3.3.1")
}

sourceSets["main"].java.srcDir("src/main/java")

gretty {
    integrationTestTask = "test"
}

