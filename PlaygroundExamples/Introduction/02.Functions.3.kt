/*
 * https://play.kotlinlang.org/byExample/01_introduction/02_Functions
 */

// Operator Functions
fun main() {

    // The operator symbol for times() is *
    operator fun Int.times(str: String) = str.repeat(this)
    println(2 * "Bye ")

    // The get() operator enables bracket-access syntax.
    operator fun String.get(range: IntRange) = substring(range)
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14])
}
