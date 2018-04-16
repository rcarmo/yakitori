import com.natpryce.konfig.*
import java.io.File

object server : PropertyGroup() {
    val port by intType
    val host by stringType
}

// configuration object - 
val config = systemProperties() overriding
             EnvironmentVariables() overriding
             ConfigurationProperties.fromFile(File("/config/container.properties")) overriding
             ConfigurationProperties.fromResource("defaults.properties")