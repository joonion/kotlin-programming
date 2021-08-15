// 1. 블록이 본문인 함수
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

// 2. 식이 본문인 함수
fun max2(a: Int, b: Int): Int = if (a > b) a else b

// 3. 식이 본문인 함수 (타입 추론 사용)
fun max3(a: Int, b: Int) = if (a > b) a else b

// 식이 본문인 함수만 타입 추론 사용 가능. 
// 블록이 본문인 함수는 리턴 타입을 지정하고 반드시 return 해야 함.

fun main() {
    println(max(10, 20))
    println(max2(10, 20))
    println(max3(10, 20))
}

