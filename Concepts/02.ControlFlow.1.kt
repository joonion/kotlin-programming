
fun main() {
    loop@ for (i in 1..100) {
        for (j in 1..100) {
            println("$i, $j")
            if (i == 10 && j == 10)
                break@loop
        }
    }
}