# kbignum

A KMM implementation of java.math.BigInteger and java.math.BigDecimal using [Google's J2ObjC](https://developers.google.com/j2objc).
Java classes are transpiled to Objective-C and compiled into static libraries for KMM.
As far as possible, KBigInteger and KBigDecimal are identical to their java counterparts.

## Supported Platforms

* jvm
* android
* iosX64
* iosArm64
* iosSimulatorArm64

## Build

This project builds for iOS, so can only be built on OSX with Xcode tools installed.
Clone the [J2ObjC project](https://github.com/google/j2objc) to the same directory the project is in, then follow [these instructions](https://developers.google.com/j2objc/guides/building-j2objc) to build it.
Build J2ObjC with `J2OBJC_ARCHS="iphone64 simulator64 simulator" make clean && make -j8 all_dist`.
Then run `./script/ios-build.sh` to create the iOS static libraries required for this project.
Once the static libraries are present in `kbignum/iosMain/objc`, the project can be built as normal with `./gradlew clean build`.

## Usage

Currently available via Github Packages.
Follow [Github instructions](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token) for a personal access token.
In the example below `GITHUB_USER` and `GITHUB_TOKEN` are environment variables referring to valid Github credentials.

### Add repository

```
repositories {
    google()
    mavenCentral()
    maven {
        url = uri("https://maven.pkg.github.com/benpapacek/kbignum")
        credentials {
            username = System.getenv("GITHUB_USER")
            password = System.getenv("GITHUB_TOKEN")
        }
    }
}
```

### Add dependency

```
val commonMain by getting {
    dependencies {
        implementation("com.papacekb.kbignum:kbignum:0.1.0")
    }
}
```
