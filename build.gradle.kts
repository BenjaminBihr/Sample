// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
}

allprojects {
    configurations.all {
        resolutionStrategy {
            force("androidx.viewpager2:viewpager2:1.1.0")
//            force("androidx.recyclerview:recyclerview:1.2.1")
        }
    }
}