fun sum1(a: Int, b: Int): Int {
    return a + b
}

// A function body can be an expression.
// Its return type is inferred.
fun sum2(a: Int, b: Int) = a + b

// A function that returns no meaningful value.
fun printSum1(a: Int, b: Int): Unit {
    println("$a + $b = ${a+b}")
}

// Unit return type can be omitted.
fun printSum2(a: Int, b: Int) {
    println("$a + $b = ${a+b}")
}

fun main() {
    println(sum1(3, 4))
    println(sum2(3, 4))
    printSum1(3, 4)
    printSum2(3, 4)
}