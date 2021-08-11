/*
 * https://play.kotlinlang.org/byExample/01_introduction/02_Functions
 */

// Functions with vararg Parameters
fun main() {

    fun printAll(vararg messages: String) {
        for (m in messages) println(m)
    }
    printAll("Hello", "Hallo", "Salut", "Hola", "안녕")

    fun printAllWithPrefix(vararg messages: String, prefix: String) {
        for (m in messages) println(prefix + m)
    }
    printAllWithPrefix("Hello", "Hallo", "Salut", "Hola", "안녕", prefix="Greeting: ")
 
    // At runtime, a vararg is just an Array<String>. 
    // Use a special spread operator * to pass it along into a vararg parameter.
    fun log(vararg entries: String, prefix: String = "Greeting: ") {
        printAllWithPrefix(*entries, prefix = prefix)
    }
    log("Hello", "Hallo", "Salut", "Hola", "안녕", prefix="인사: ")
    log("Hello", "Hallo", "Salut", "Hola", "안녕")
}
