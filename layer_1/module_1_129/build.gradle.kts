plugins {
  id("awesome.androidlib.plugin")
}

dependencies {
    
    implementation(project(":layer_0:module_0_60"))
    implementation(project(":layer_0:module_0_62"))
    implementation(project(":layer_0:module_0_2"))
    implementation(project(":layer_0:module_0_58"))
    implementation(project(":layer_0:module_0_33"))
    implementation(project(":layer_0:module_0_68"))
    implementation(project(":layer_0:module_0_79"))
    implementation(project(":layer_0:module_0_51"))
    implementation(project(":layer_0:module_0_45"))
    implementation(project(":layer_0:module_0_27"))
    implementation(project(":layer_0:module_0_22"))
    implementation(project(":layer_0:module_0_74"))
    implementation(project(":layer_0:module_0_43"))
    implementation(project(":layer_0:module_0_77"))
    implementation(project(":layer_0:module_0_29"))
    implementation(project(":layer_0:module_0_61"))
    implementation(project(":layer_0:module_0_85"))
    implementation(project(":layer_0:module_0_64"))
    implementation(project(":layer_0:module_0_63"))
    implementation(project(":layer_0:module_0_55"))
    implementation(project(":layer_0:module_0_40"))
    implementation(project(":layer_0:module_0_21"))
    implementation(project(":layer_0:module_0_32"))
    implementation(project(":layer_0:module_0_39"))
    implementation(project(":layer_0:module_0_81"))
    implementation(project(":layer_0:module_0_70"))
    implementation(project(":layer_0:module_0_23"))
    implementation(project(":layer_0:module_0_78"))
    implementation(project(":layer_0:module_0_28"))
    implementation(project(":layer_0:module_0_19"))
    implementation(project(":layer_0:module_0_54"))
    implementation(project(":layer_0:module_0_80"))
    implementation(project(":layer_0:module_0_25"))
    implementation(project(":layer_0:module_0_16"))
    implementation(project(":layer_0:module_0_52"))
    implementation(project(":layer_0:module_0_47"))
    implementation(project(":layer_0:module_0_31"))
    implementation(project(":layer_0:module_0_5"))
    implementation(project(":layer_0:module_0_86"))
    implementation(project(":layer_0:module_0_69"))
    implementation(project(":layer_0:module_0_75"))
    implementation(project(":layer_0:module_0_42"))
    implementation(project(":layer_0:module_0_18"))
    implementation(project(":layer_0:module_0_36"))
    implementation(project(":layer_0:module_0_35"))
    implementation(project(":layer_0:module_0_34"))
    implementation(project(":layer_0:module_0_60"))
    implementation(project(":layer_0:module_0_62"))
    implementation(project(":layer_0:module_0_2"))
    implementation(project(":layer_0:module_0_58"))
    implementation(project(":layer_0:module_0_33"))
    implementation(project(":layer_0:module_0_68"))
    implementation(project(":layer_0:module_0_79"))
    implementation(project(":layer_0:module_0_51"))
    implementation(project(":layer_0:module_0_45"))
    implementation(project(":layer_0:module_0_27"))
    implementation(project(":layer_0:module_0_22"))
    implementation(project(":layer_0:module_0_74"))
    implementation(project(":layer_0:module_0_43"))
    implementation(project(":layer_0:module_0_77"))
    implementation(project(":layer_0:module_0_29"))
    implementation(project(":layer_0:module_0_61"))
    implementation(project(":layer_0:module_0_85"))
    implementation(project(":layer_0:module_0_64"))
    implementation(project(":layer_0:module_0_63"))
    implementation(project(":layer_0:module_0_55"))
    implementation(project(":layer_0:module_0_40"))
    implementation(project(":layer_0:module_0_21"))
    implementation(project(":layer_0:module_0_32"))
    implementation(project(":layer_0:module_0_39"))
    implementation(project(":layer_0:module_0_81"))
    implementation(project(":layer_0:module_0_70"))
    implementation(project(":layer_0:module_0_23"))
    implementation(project(":layer_0:module_0_78"))
    implementation(project(":layer_0:module_0_28"))
    implementation(project(":layer_0:module_0_19"))
    implementation(project(":layer_0:module_0_54"))
    implementation(project(":layer_0:module_0_80"))
    implementation(project(":layer_0:module_0_25"))
    implementation(project(":layer_0:module_0_16"))
    implementation(project(":layer_0:module_0_52"))
    implementation(project(":layer_0:module_0_47"))
    implementation(project(":layer_0:module_0_31"))
    implementation(project(":layer_0:module_0_5"))
    implementation(project(":layer_0:module_0_86"))
    implementation(project(":layer_0:module_0_69"))
    implementation(project(":layer_0:module_0_75"))
    implementation(project(":layer_0:module_0_42"))
    implementation(project(":layer_0:module_0_18"))
    implementation(project(":layer_0:module_0_36"))
    implementation(project(":layer_0:module_0_35"))
    implementation(project(":layer_0:module_0_34"))
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
        