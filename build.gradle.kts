import de.klg71.kotlintestplugin.KotlinTestExtension

buildscript {
    repositories {
        flatDir {
            dirs("libs")
        }
    }
    dependencies {
        classpath("de.klg71:kotlintestplugin:0.0.1-SNAPSHOT")
    }
}

apply(plugin="de.klg71.kotlintestplugin")

configure<KotlinTestExtension> {
    message = "Hello Dose of Kotlin"
}
