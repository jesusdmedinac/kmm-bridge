plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.application") version "8.0.2" apply false
    id("com.android.library") version "8.0.2" apply false
    kotlin("android") version "1.8.21" apply false
    kotlin("multiplatform") version "1.8.21" apply false
    id("co.touchlab.faktory.kmmbridge") version "0.3.4" apply false
}

subprojects {
    val properties = java.util.Properties()
    val envProperties = File(rootDir, "env.properties")

    if (envProperties.isFile) {
        java.io.InputStreamReader(
            java.io.FileInputStream(envProperties),
            com.google.common.base.Charsets.UTF_8
        ).use { reader ->
            properties.load(reader)
        }
    }

    group = properties["GROUP"]!!
    version = properties["LIBRARY_VERSION"]!!
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
