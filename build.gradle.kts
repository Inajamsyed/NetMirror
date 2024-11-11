plugins {
    kotlin("jvm") version "1.5.30"
}

group = "com.flixclusive.provider"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    // For making HTTP requests
    implementation("io.ktor:ktor-client-core:2.0.0") // Core HTTP client library
    implementation("io.ktor:ktor-client-cio:2.0.0")  // CIO engine for making HTTP requests

    // For HTML parsing if `iosmirror.cc` doesn’t have an API
    implementation("org.jsoup:jsoup:1.15.3") // For parsing HTML if needed
    
    // For JSON handling if response is in JSON format
    implementation("com.google.code.gson:gson:2.8.9") // JSON parsing
}

// Provider-specific settings
ext {
    providerName = "IosmirrorProvider"
    description = "Provider for content from iosmirror.cc"
}
