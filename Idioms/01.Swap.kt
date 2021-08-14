fun main() {
    var a = 10
    var b = 20
    a = b.also { b = a }
    println("$a, $b")
}