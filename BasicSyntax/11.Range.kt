fun main() {
    // a range can be used with in operator.
    val x = 10
    val y = 9
    if (x in 1..y+1)
        println("fits in range")

    println(1..10)
    
    for (i in 1..10 step 2)
        print("$i ")
    println()

    for (i in 9 downTo 0 step 2)
        print("$i ")
    println()
}