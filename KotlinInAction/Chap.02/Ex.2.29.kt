import java.io.*

fun readNumber(reader: BufferedReader): Int? {
    return try {
        Integer.parseInt(reader.readLine())
    }
    catch (e: NumberFormatException) {
        null
    }
}

fun main() {
    val reader = BufferedReader(StringReader("314"))
    println(readNumber(reader))
    val reader2 = BufferedReader(StringReader("3.14"))
    println(readNumber(reader2))

}