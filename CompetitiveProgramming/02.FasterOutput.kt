// Issuing so many println() calls is too slow,
// sinc the output in Kotlin is automatically flushed after each line.

// A faster way to write many lines from an array or a list
// is to use joinToString() function with "\n" as the operator. 

fun main() {
    println(a.joinToString("\n"))
}
