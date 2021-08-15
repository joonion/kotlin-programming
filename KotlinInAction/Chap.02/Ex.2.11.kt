// enum 클래스에도 프로퍼티를 선언할 수 있다. 
enum class Color(val r: Int, val g: Int, val b: Int) {
    // 각 상수를 선언할 때 해당하는 프로퍼티의 값을 지정 가능.
    RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255), 
    YELLOW(255, 255, 0), ORANGE(255, 165, 0), INDIGO(75, 0, 130), VIOLET(238, 130, 238);
    // 상수 선언의 마지막에 세미콜론을 추가해야한다. (메소드와의 구분이 필요할 때)
    // 코틀린에서는 유일하게 세미콜론이 필수인 부분이란다. 

    // enum 클래스 안에서 메소드 선언 가능
    fun rgb() = (r * 256 + g) * 256 + b
}

fun main() {
    println("0x${Integer.toHexString(Color.RED.rgb()).uppercase()}")
}
