import Color.*

fun mix2(c1: Color, c2: Color) = 
    when {
        (c1 == RED && c2 == YELLOW) || (c2 == RED && c1 == YELLOW)   -> ORANGE
        (c1 == YELLOW && c2 == BLUE) || (c2 == YELLOW && c1 == BLUE) -> GREEN
        (c1 == BLUE && c2 == VIOLET) || (c2 == BLUE && c1 == VIOLET) -> INDIGO
        else -> throw Exception("Dirty color")
    }

fun main() {
    println(mix2(Color.RED, Color.YELLOW))
    println(mix2(Color.GREEN, Color.YELLOW))
}
