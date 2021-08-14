fun main() {
    val i1: Byte = 1
    val i2: Short = 2
    val i3: Int = 3
    val i4: Long = 4
    println("$i1, $i2, $i3, $i4")

    val f1: Float = 3.14f
    val f2: Double = 3.141592653589
    println("$f1, $f2")

    val d16 = 0xFF
    val d2 = 0b11111111
    val fp = 3.14e4
    println("$d16, $d2, $fp")

    // You can use underscores to make constants more readable
    val oneThousand = 10_000_000
    val hex = 0xFF_00_FF_00
    val bin = 0b11111111_00000000_11111111_00000000
    println("$oneThousand, $hex, $bin")

    val hex2: Int = hex.toInt()
    println("$hex2 ${hex.toLong()}")

    val x = 5 / 2
    // println(x == 2.5)
    // error: operator '==' cannot be applied to 'Int' and 'Double'
    println(x == 2)

    
}