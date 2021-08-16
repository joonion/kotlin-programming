fun main() {
    val list = arrayListOf("Hello", "World", "Kotlin")
    for ((i, item) in list.withIndex()) {
        println("${String.format("%02d", i)}: $item")
    }
}
