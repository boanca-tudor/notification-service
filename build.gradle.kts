plugins {
    id("spring-service")
}

dependencies {
    implementation(libs.spring.web)
    implementation(libs.spring.jpa)

    implementation(project(":common"))
}