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
