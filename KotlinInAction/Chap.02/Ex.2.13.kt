enum class Color {
    RED, GREEN, BLUE, ORANGE, YELLOW, INDOGO, VIOLET
}

fun getWarmth(color: Color) = when (color) {
    Color.RED, Color.ORANGE, Color.YELLOW, -> "warm"
    Color.GREEN                            -> "neutral"
    Color.BLUE, Color.INDOGO, Color.VIOLET -> "cold"
}

fun main() {
    println(getWarmth(Color.RED))
    println(getWarmth(Color.GREEN))
    println(getWarmth(Color.INDOGO))
}