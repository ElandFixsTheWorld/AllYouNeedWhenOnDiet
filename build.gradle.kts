
// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        mavenCentral()
//        maven {
//            url ("https://oss.sonatype.org/content/repositories/snapshots/")
//        }
        google()
    }
//    dependencies {
//        classpath ("io.realm:realm-gradle-plugin:10.11.1")
//    }
}

plugins {
    id("com.android.application") version "8.2.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.23" apply false
}