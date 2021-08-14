fun main() {
    val list = listOf(-1, 2, -3, 4, -5)
    var positives = list.filter { x -> x > 0 }
    for (i in positives) print("$i ")
    println()
    positives = list.filter { it > 0 }
    for (i in positives) print("$i ")
    println()
}