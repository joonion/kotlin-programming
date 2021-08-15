// 커스텀 프로퍼티: get() 선언
class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() { 
            return (height == width)
        }
    val isSquare2: Boolean
        get() = (height == width)

    // get() 함수 정의 방식과  커스텀 게터를 정의하는 방식: 
    // 둘 다 똑같다고 한다. 
}

fun main() {
    val rect1 = Rectangle(10, 20)
    val rect2 = Rectangle(20, 20)
    println(rect1.isSquare)
    println(rect2.isSquare)
    println(rect1.isSquare2)
    println(rect2.isSquare2)

}