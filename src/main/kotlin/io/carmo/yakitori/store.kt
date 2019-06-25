import java.io.*
import kotlin.io.*
import kotlinx.serialization.*

@Serializable
data class FrontMatter(
    val from: String,
    val title: String,
    val date: String, // for now
    val tags: List<String>
)

fun get_file_(filename: String): MutableMap<String, String> {
    val buffer = File(filename).readText()
    val map = mutableMapOf<String, String>()
    val parts = buffer.split("\n",1)
    val result = Yaml.default.parse(FrontMatter.serializer(), parts[0])
    return parts
}

