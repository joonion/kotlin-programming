// Classes are final by default.
// Mark it as open to make a class inheritable.

open class Shape

class Rectangle(val height: Double, val length: Double) {
    var perimeter = (height + length) / 2
}

fun main() {
    val rect = Rectangle(10.0, 20.0)
    println(rect.perimeter)
}


