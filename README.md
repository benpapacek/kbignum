# kbignum

A KMM implementation of java.math.BigInteger and java.math.BigDecimal using [Google's J2ObjC](https://developers.google.com/j2objc).
Java classes are transpiled to Objective-C and compiled into static libraries for KMM.
As far as possible, KBigInteger and KBigDecimal are interchangeable with their java counterparts.

## Supported Platforms

* jvm
* android
* iosX64
* iosArm64
* iosSimulatorArm64

## Usage

Currently available via Github Packages.
Follow [Github instructions](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token) for a personal access token.
In the example below `GITHUB_USER` and `GITHUB_TOKEN` are environment variables referring to valid github credentials.

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
