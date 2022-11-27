plugins {
    kotlin("multiplatform")
    id("com.android.library")
}

kotlin {
    android()
    
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
                    "$projectDir/src/iosMain/objc/src",
                    "$projectDir/../../j2objc/include"
                )
                extraOpts(
                    "-libraryPath", "$projectDir/src/iosMain/objc",
                    "-libraryPath", "$projectDir/../../j2objc/lib/simulator"
                )
            }
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
        val androidMain by getting {
            kotlin.srcDir("$projectDir/../../kbignum-java/src/main/java")
        }
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