plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

repositories {
    google() // Adicione esta linha para acessar os repositórios Maven do Google
    mavenCentral()
}

android {
    namespace = "br.com.fiap.chegouaqui"  // Adicione a linha do namespace aqui
    compileSdk = (33)
    defaultConfig {
        applicationId = "com.example.chegouaqui"
        minSdk = (21)
        targetSdk = (33)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
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
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.20")
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.lifecycle:lifecycle-extensions:2.2.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.5.1")
    implementation("androidx.room:room-runtime:2.5.1")
    implementation("androidx.room:room-ktx:2.5.1")
    implementation("androidx.recyclerview:recyclerview:1.3.1")

    // Dependências do Google Play Services para autenticação OAuth 2.0
    implementation("com.google.android.gms:play-services-auth:20.6.0")

    // Dependências para a API do Gmail
    implementation("com.google.api-client:google-api-client:1.32.2")
    implementation("com.google.api-client:google-api-client-android:1.32.2")
    implementation("com.google.apis:google-api-services-gmail:v1-rev20220504-1.32.1")

    // Dependências para manipulação de JSON
    implementation("com.fasterxml.jackson.core:jackson-core:2.13.3")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.13.3")
    implementation("com.fasterxml.jackson.core:jackson-annotations:2.13.3")

    // Dependências para suporte ao Kotlin coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4")

    // Dependências para injeção de dependências (opcional, se necessário)
    implementation("io.insert-koin:koin-android:3.3.0")
    implementation("androidx.compose.foundation:foundation-layout-android:1.6.8")
    implementation("androidx.compose.material3:material3-android:1.2.1")
    implementation("androidx.compose.ui:ui-tooling-preview-android:1.6.8")
    implementation("androidx.navigation:navigation-runtime-ktx:2.7.7")
    implementation("androidx.navigation:navigation-compose:2.7.7")

    //Dependência do Navigation
    implementation("androidx.navigation:navigation-compose:2.7.7")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}
