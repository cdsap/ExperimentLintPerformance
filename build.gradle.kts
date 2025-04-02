import com.android.build.gradle.internal.lint.AndroidLintAnalysisTask
import com.android.build.gradle.internal.services.getBuildService
import com.logic.FooBuildService.RegistrationAction1
import com.logic.FooBuildService
plugins {
    id("org.jetbrains.kotlin.jvm") version("2.1.20") apply false
    id("org.jetbrains.kotlin.plugin.compose") version("2.1.20") apply false
    id("com.android.application") version "8.9.0" apply false
    id("com.android.library") version "8.9.0" apply false
    id ("io.github.cdsap.kotlinprocess") version "0.1.7"
    id ("io.github.cdsap.gradleprocess") version "0.1.3"
    id ("io.github.cdsap.gcreport") version "0.1.0"
    id("root")
}

gcReport {
    logs = listOf("gradle_gc.log")
}

allprojects {
    RegistrationAction1(
        project,
        2,
    ).execute()
    tasks.withType<AndroidLintAnalysisTask>().configureEach {
        usesService(getBuildService(
            project.gradle.sharedServices,
            FooBuildService::class.java,
        ))
    }
}

