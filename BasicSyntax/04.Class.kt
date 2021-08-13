class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2
    val area = height * length
}

fun main() {
    val r = Rectangle(10.0, 15.0)
    println(r.height)
    println(r.length)
    println(r.perimeter)
    println(r.area)
    r.height += 10 
    println(r.height)   
    // r = Rectangle(20.0, 12.0)
    // error: val cannot be reassigned
}
