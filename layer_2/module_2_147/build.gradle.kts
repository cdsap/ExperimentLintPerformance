plugins {
  id("awesome.androidlib.plugin")
}

dependencies {
    
    implementation(project(":layer_1:module_1_103"))
    implementation(project(":layer_1:module_1_93"))
    implementation(project(":layer_1:module_1_109"))
    implementation(project(":layer_1:module_1_124"))
    implementation(project(":layer_1:module_1_89"))
    implementation(project(":layer_1:module_1_111"))
    implementation(project(":layer_1:module_1_131"))
    implementation(project(":layer_1:module_1_132"))
    implementation(project(":layer_1:module_1_116"))
    implementation(project(":layer_1:module_1_119"))
    implementation(project(":layer_1:module_1_90"))
    implementation(project(":layer_1:module_1_107"))
    implementation(project(":layer_1:module_1_108"))
    implementation(project(":layer_1:module_1_127"))
    implementation(project(":layer_1:module_1_98"))
    implementation(project(":layer_1:module_1_113"))
    implementation(project(":layer_1:module_1_122"))
    implementation(project(":layer_1:module_1_103"))
    implementation(project(":layer_1:module_1_93"))
    implementation(project(":layer_1:module_1_109"))
    implementation(project(":layer_1:module_1_124"))
    implementation(project(":layer_1:module_1_89"))
    implementation(project(":layer_1:module_1_111"))
    implementation(project(":layer_1:module_1_131"))
    implementation(project(":layer_1:module_1_132"))
    implementation(project(":layer_1:module_1_116"))
    implementation(project(":layer_1:module_1_119"))
    implementation(project(":layer_1:module_1_90"))
    implementation(project(":layer_1:module_1_107"))
    implementation(project(":layer_1:module_1_108"))
    implementation(project(":layer_1:module_1_127"))
    implementation(project(":layer_1:module_1_98"))
    implementation(project(":layer_1:module_1_113"))
    implementation(project(":layer_1:module_1_122"))
implementation("androidx.core:core-ktx:1.12.0")
implementation("androidx.appcompat:appcompat:1.6.1")
implementation("com.google.android.material:material:1.11.0")
implementation("androidx.constraintlayout:constraintlayout:2.1.4")
implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0")
implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
implementation("androidx.lifecycle:lifecycle-service:2.7.0")
implementation("androidx.fragment:fragment-ktx:1.6.2")
implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")

// Compose dependencies
implementation(platform("androidx.compose:compose-bom:2024.02.00"))
implementation("androidx.compose.ui:ui")
implementation("androidx.compose.ui:ui-graphics")
implementation("androidx.compose.ui:ui-tooling-preview")
implementation("androidx.compose.material3:material3")
implementation("androidx.compose.runtime:runtime")
implementation("androidx.compose.runtime:runtime-livedata")
implementation("androidx.activity:activity-compose:1.8.2")
implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.7.0")
debugImplementation("androidx.compose.ui:ui-tooling")
debugImplementation("androidx.compose.ui:ui-test-manifest")

// Network dependencies
implementation("com.squareup.retrofit2:retrofit:2.9.0")
implementation("com.squareup.retrofit2:converter-gson:2.9.0")
implementation("com.squareup.okhttp3:okhttp:4.12.0")
implementation("com.squareup.okhttp3:logging-interceptor:4.12.0")
}
        