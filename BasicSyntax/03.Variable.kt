// You can declare variables at the top level.
val PI = 3.141592653589
var x = 0

fun main() {

    // Read-only variables are defined with val.
    // Note that they can be assigned only once.
    val a: Int = 1 // immediate assignment
    val b = 2 // Type is inferred.
    val c: Int // Type required when no initializer is provided.
    c = 3 // deferred assignment
    println(a)
    println(b)
    println(c)

    // Variables that can be reassigned use the var keyword.
    var x = 5 // Type is inferred.
    x += 5
    println(x)

    fun incrementX() {
        x += 1
    }
    incrementX()
    println(x)
}