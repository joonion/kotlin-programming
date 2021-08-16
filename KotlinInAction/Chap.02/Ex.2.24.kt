import java.util.*

val binaryMap = TreeMap<Char, String>()

fun main() {
    for (c in 'A'..'F')
        binaryMap[c] = Integer.toBinaryString(c.toInt())
    for ((key, value) in binaryMap)
        println("$key = $value")
}
