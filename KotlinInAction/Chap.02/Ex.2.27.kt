import java.io.*

fun readNumber(reader: BufferedReader): Int? {
    try {
        var line = reader.readLine()
        println(Integer.parseInt(line.trim()))
        while (line != null) {
            line = reader.readLine()
            println(Integer.parseInt(line.trim()))
        }
        return 0
    }
    catch (e: NumberFormatException) {
        return null
    }
    finally {
        reader.close()
    }
}

fun main() {
    val reader = BufferedReader(FileReader("Ex.2.27.in"))
    readNumber(reader)
}