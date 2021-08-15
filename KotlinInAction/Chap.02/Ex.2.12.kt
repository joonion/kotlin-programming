enum class Color {
    RED, GREEN, BLUE, ORANGE, YELLOW, INDOGO, VIOLET
}

fun getMnemonic(color: Color) = 
    when (color) {
        Color.RED    -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN  -> "Gave"
        Color.BLUE   -> "Battle"
        Color.INDOGO -> "In"
        Color.VIOLET -> "Vain"
    }

fun main() {
    println(getMnemonic(Color.VIOLET))
}