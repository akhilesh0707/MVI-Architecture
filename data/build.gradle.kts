plugins {
    id(AndroidConfig.Plugins.kotlin)
    id(AndroidConfig.Plugins.javaLibrary)
    id(AndroidConfig.Plugins.kotlinKapt)
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    // Modules
    implementation(project(AndroidConfig.Modules.domain))

    // Kotlin coroutines
    implementation(Dependencies.kotlin)
    implementation(Dependencies.coroutineCore)
    // JavaX
    implementation(Dependencies.Data.javax)
    // Network (Retrofit, moshi, interceptor)
    implementation(Dependencies.Data.retrofit)
    implementation(Dependencies.Data.moshiConverter)
    implementation(Dependencies.Data.loggingInterceptor)

    // Room
    api(Dependencies.Data.roomKtx)
    api(Dependencies.Data.roomRuntime)
    kapt(Dependencies.Data.roomCompilerKapt)
    // Timber logging
    implementation(Dependencies.Data.timber)
}