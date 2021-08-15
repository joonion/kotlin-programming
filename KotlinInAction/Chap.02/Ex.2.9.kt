package geometry.examples

import geometry.shapes.createRandomRectangle

fun main() {
    for (i in 1..10) {
        val rect = createRandomRectangle()
        println("${rect.height}x${rect.width}: ${rect.isSquare}")
    }
}