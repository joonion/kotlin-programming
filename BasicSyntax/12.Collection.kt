fun main() {
    val items = listOf("Cuckoo", "홍길동", "전우치", "허생", "연오랑", "세오녀", "마루치", "아라치")
    for (item in items) print("$item ")
    println()
    when {
        "Cuckoo" in items -> println("뻐꾸기")
        "홍길동" in items -> println("전우치")
        "연오랑" in items -> println("세오녀")
        "성춘향" in items -> println("이몽룡")
    }

    val fruits = listOf("banana", "avocado", "apple", "kiwi")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }
}