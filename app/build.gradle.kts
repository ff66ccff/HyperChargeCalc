plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    // 移除 Compose 插件: alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.hyperchargecalc"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.hyperchargecalc"
        minSdk = 24
        targetSdk = 35
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    // 移除 Compose build feature
    // buildFeatures {
    //     compose = true
    // }
}

dependencies {

    // 添加这两个核心库用于传统XML视图和Material Design
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")

    // 保留这个核心库
    implementation(libs.androidx.core.ktx)

    // 移除所有和Compose相关的依赖
    // implementation(libs.androidx.lifecycle.runtime.ktx)
    // implementation(libs.androidx.activity.compose)
    // implementation(platform(libs.androidx.compose.bom))
    // implementation(libs.androidx.ui)
    // implementation(libs.androidx.ui.graphics)
    // implementation(libs.androidx.ui.tooling.preview)
    // implementation(libs.androidx.material3)

    // 测试相关的库可以保留
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // 移除Compose测试相关的库
    // androidTestImplementation(platform(libs.androidx.compose.bom))
    // androidTestImplementation(libs.androidx.ui.test.junit4)
    // debugImplementation(libs.androidx.ui.tooling)
    // debugImplementation(libs.androidx.ui.test.manifest)
}