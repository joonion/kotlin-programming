// 확장 프로퍼티: 뒷받침하는 필드가 없으므로 기본 게터 구현을 제공할 수 없다.
// 따라서 게터 함수는 꼭 정의를 해야 한다고 한다. 
val String.lastChar: Char
    get() = get(length - 1)

fun main() {
    println("Hello, World!".lastChar)
}