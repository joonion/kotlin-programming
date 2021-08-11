/*
 * https://play.kotlinlang.org/byExample/01_introduction/02_Functions
 */

// returns Unit (i.e., no return value)
fun printMessage(message: String): Unit {
    println(message)
}

// Default Parameter Values and Named Arguments
fun printMessageWithPrefix(message: String, prefix: String = "INFO") {
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}


// A single-expression function that returns an integer (inferred).
fun mult(x: Int, y: Int) = x * y

fun main() {
    printMessage("Hello!")
    printMessageWithPrefix("Hello", "LOG")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix="WARN", message="Hello")
    println(sum(1, 2))
    println(mult(2, 4))
}
