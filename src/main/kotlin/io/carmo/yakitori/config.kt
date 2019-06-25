package io.carmo.yakitori.config

import com.natpryce.konfig.*


object server : PropertyGroup() {
    val port by intType
    val host by stringType
}

// configuration object - 
val config = ConfigurationProperties.systemProperties() overriding
             EnvironmentVariables() overriding
             ConfigurationProperties.fromResource("defaults.properties")
