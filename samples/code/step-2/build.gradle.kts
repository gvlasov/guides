plugins {
    `build-scan`
    kotlin("jvm") version "1.2.10"
}

repositories {
    jcenter()
}

// tag::configure-dependencies[]
dependencies {
    implementation(kotlin("stdlib", "1.2.10"))
    testImplementation("junit:junit:4.12") // <1>
}
// tag::configure-dependencies[]

buildScan {
    setLicenseAgreementUrl("https://gradle.com/terms-of-service")
    setLicenseAgree("yes")

    publishAlways()
}
