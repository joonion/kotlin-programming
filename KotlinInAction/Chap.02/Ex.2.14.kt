import Color.*

fun getWarmth(color: Color) = when (color) {
    RED, ORANGE, YELLOW, -> "warm"
    GREEN                -> "neutral"
    BLUE, INDOGO, VIOLET -> "cold"
}

fun main() {
    println(getWarmth(Color.RED))
    println(getWarmth(Color.GREEN))
    println(getWarmth(Color.INDOGO))
}
