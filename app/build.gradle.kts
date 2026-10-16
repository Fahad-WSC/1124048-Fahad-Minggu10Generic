plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.postgresql:postgresql:42.7.2")
}

application {
    mainClass.set("pbo.App")
}