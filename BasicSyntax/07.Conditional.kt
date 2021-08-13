
fun maxOf(a: Int, b: Int): Int {
    if (a > b) return a
    else return b
}

fun main() {
    // if can also be used as an expression.
    println(maxOf(10, 20))   

    fun maxOf2(a: Int, b: Int) = if (a > b) a else b
    println(maxOf2(10, 30))

    val c = if (100 > 200) 100 else 200
    println(c)
}