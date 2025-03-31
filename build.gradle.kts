plugins {
    id("org.jetbrains.kotlin.jvm") version("2.1.20") apply false
    id("org.jetbrains.kotlin.plugin.compose") version("2.1.20") apply false
    id("com.android.application") version "8.9.0" apply false
    id("com.android.library") version "8.9.0" apply false
    id ("io.github.cdsap.kotlinprocess") version "0.1.7"
    id ("io.github.cdsap.gradleprocess") version "0.1.3"
    id ("io.github.cdsap.gcreport") version "0.1.0"
}

gcReport {
    logs = listOf("gradle_gc.log")
}
