fun main() {
    val items = listOf(1, 2, 3, 4, 5)
    for (i in items) print("$i ")
    println()
    for (i in items.indices) 
        println("$i: ${items[i]}")

    val items2 = listOf("Hello", "World", "Kotlin")
    for (i in items2) print(i)
    println()
    for (i in items2.indices) 
        println("$i: ${items2[i]}")

    for (i in 0..(items2.size-1))
        println("$i: ${items2[i]}")


    var i: Int = items.size
    while (i >= 0) {
        i -= 1
        println("$i: ${items[i]}")
    }
}