import org.gradle.api.publish.PublishingExtension

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("maven-publish")
}

kotlin {
    android()
    jvm()
    
    listOf(
//        iosX64(),
//        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "kbignum"
        }
        it.testRuns.forEach { tr ->
            tr.deviceId = properties["iosSimulatorName"] as? String ?: "iPhone 14 Pro"
        }
        it.compilations.getByName("main") {
            val javaObjc by cinterops.creating {
                defFile("$projectDir/src/iosMain/cinterop/iosSimulatorArm64.def")
                includeDirs(
                    "$projectDir/src/iosMain/objc/src/com/papacekb/kbignum/",
                    "$projectDir/../../j2objc/include"
                )
                extraOpts(
                    "-libraryPath", "$projectDir/src/iosMain/objc",
                    "-libraryPath", "$projectDir/../../j2objc/lib/simulator"
                )
            }
        }
    }

    val publicationsFromMainHost = listOf(android(), iosSimulatorArm64()).map { it.name } + "kotlinMultiplatform"
    configure<PublishingExtension> {
        publications {
            matching { it.name in publicationsFromMainHost }.all {
                val targetPublication = this@all
                tasks.withType<AbstractPublishToMaven>()
                    .matching { it.publication == targetPublication }
                    .configureEach { onlyIf { findProperty("isMainHost") == "true" } }
            }
        }

        repositories {
            maven(url = "com.github.benpapacek:kbignum:master-SNAPSHOT")
        }
    }

    sourceSets {
        val commonMain by getting
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))

                implementation("com.ionspin.kotlin:bignum:0.3.7")
            }
        }
        val jvmMain by getting {
            dependsOn(commonMain)
            kotlin.srcDir("$projectDir/src/jvmMain/java")
        }
        val androidMain by getting
        val androidTest by getting
//        val iosX64Main by getting
//        val iosArm64Main by getting
        val iosSimulatorArm64Main by getting
        val iosMain by creating {
            dependsOn(commonMain)
//            iosX64Main.dependsOn(this)
//            iosArm64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)
        }
//        val iosX64Test by getting
//        val iosArm64Test by getting
        val iosSimulatorArm64Test by getting
        val iosTest by creating {
            dependsOn(commonTest)
//            iosX64Test.dependsOn(this)
//            iosArm64Test.dependsOn(this)
            iosSimulatorArm64Test.dependsOn(this)
        }
    }
}

android {
    namespace = "com.papacekb.kbignum"
    compileSdk = 32
    defaultConfig {
        minSdk = 21
        targetSdk = 32
    }
}