plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    //alias(libs.plugins.kotlin.kapt)
//    alias(libs.plugins.androidx.navigation.safeargs.kotlin)
//    alias(libs.plugins.dagger.hilt.android)
    alias (libs.plugins.kotlin.kapt)
}

android {
    namespace = "com.example.cleanarchitecturenoteapp"
    compileSdk = 34

    //step1
    buildFeatures {
        compose=true
    }
//    buildscript{
//        ext {
//            composeVersion = "1.4.3"
//        }
//    }

    defaultConfig {
        applicationId = "com.example.cleanarchitecturenoteapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.lifecycle.viewmodel.compose)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    //compose
    val composeBom = platform("androidx.compose:compose-bom:2025.02.00")
    implementation(composeBom)
    androidTestImplementation("androidx.compose:compose-bom:2025.02.00")

   // implementation (libs.hilt.android)


}
