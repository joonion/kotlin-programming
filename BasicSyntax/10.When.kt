fun describe(obj: Any): String = 
    when (obj) {
        1           -> "One"
        "Hello"     -> "Greeting"
        is Long     -> "Long"
        !is String  -> "Not a String"
        else        -> "unkown"
    }

fun main() {
    println(describe(1))
    println(describe("Hello"))
    val x: Long = 123
    println(describe(x))
    val y: Double = 123.0
    println(describe(y))
    println(describe("World"))
}