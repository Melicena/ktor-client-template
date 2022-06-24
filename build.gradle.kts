import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val ktor_version: String by project

plugins {
    kotlin("jvm") version "1.7.0"
    application
}

group = "me.ruben"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // ktor-client-corees una dependencia central que proporciona la funcionalidad principal del cliente, mientras
    // que ktor-client-cioes una dependencia para un motor que procesa solicitudes de red.
    implementation("io.ktor:ktor-client-core:2.0.2")
    implementation("io.ktor:ktor-client-cio:2.0.2")
}


tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}