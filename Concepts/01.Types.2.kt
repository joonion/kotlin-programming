fun main() {

    // bitwise operation: shl, shr, ushr, and, or, xor, inv
    val x = (1 shl 2) and 0x000FF000
    print(x)

    val i1: UByte = 1u
    val i2: UShort = 2u
    val i3: UInt = 3u
    val i4: ULong = 4U
    println("$i1, $i2, $i3, $i4")

    val aChar: Char = 'a'
    println(aChar)

    // Strings are immutable.
    val str: String = "abcd 1234"
    println(str)

    for (c in str) {
        println(c)
    }

    // String concatenation, as long as the first element is a String.
    val s = "abcd" + 1234
    println(s)

    // val s2 = 1234 + "abcd"
    // error: none of the following functions can be called with the arguments supplied: 

    // A raw string is delimited by a triple quote.
    val text = """
        >Tell me and I forget.
        >Teach me and I remember.
        >Involve me and I learn.
        >(Benjamin Franklin)
        """.trimMargin(">")
    println(text)

    // Arrays in Kotlin are invariant. (Type Projections)
    val asc = Array(5) { i -> (i * i).toString() }
    asc.forEach { println(it) }

    // Kotlin also has classes that represent arrays of primitive types 
    // without boxing overhead. 
    val arr: IntArray = intArrayOf(1, 2, 3, 4, 5)
    for (i in 0..arr.size-1)
        print("${arr[i]} ")
    println()

    val arr2 = IntArray(5) { it + 1 }
    for (i in 0..arr2.size-1)
        print("${arr2[i]} ")
    println()

    val arr3 = IntArray(5) { 7 }
    for (i in 0..arr3.size-1)
        print("${arr3[i]} ")
    println()


}