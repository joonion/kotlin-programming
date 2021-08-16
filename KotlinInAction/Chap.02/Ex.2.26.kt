fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "digit"
    in 'a'..'z', in 'A'..'Z' -> "letter"
    else -> "I don't know"
}

fun main() {
    println(recognize('7'))
    println(recognize('c'))
    println(recognize('한'))

    // .. 연산자의 범위는 Comparable 객체라면 모두 만들 수 있대.
    println("Kotlin" in "Java".."Scala")

    // in 연산자는 Collection에서는 모두 다 사용할 수 있대.
    println("Kotlin" in setOf("Java", "Scala"))
}