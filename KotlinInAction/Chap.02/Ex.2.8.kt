package geometry.shapes

import java.util.Random

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = (height == width)
}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(Math.abs(random.nextInt()), Math.abs(random.nextInt()));
}
