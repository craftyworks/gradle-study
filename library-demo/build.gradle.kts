version = "0.1.0"

plugins {
    `java-library`
}

repositories {
    jcenter()
}

dependencies {
    api("org.apache.commons:commons-math3:3.6.1")

    implementation("com.google.guava:guava:28.1-jre")

    testImplementation("junit:junit:4.12")
}

tasks {
    jar {
        manifest {
            attributes(
                mapOf("Implementation-Title" to project.name,
                      "Implementation-Version" to project.version)
                )
        }
    }
}

