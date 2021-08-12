fun main() {
    // Get rid of pesky NullPointerException.
    var output: String = ""
    // output = null 
    // error: null can not be a value of a non-null type String
    println(output)

    var name: String? = null // Nullable type
    // println(name.length())
    // error: only safe (?.) or non-null asserted (!!.) calls 
    // are allowed on a nullable receiver of type String?
    println(name)

    // If you check a type is right, 
    // then the compiler will auto-cast it for you.

    class Invoice(val total: Int = 10) {
        fun calculateTotal() { println(total) }
    }

    fun calculateTotal(obj: Any) {
        println(obj is Invoice)
        // obj.caculateTotal()
        if (obj is Invoice) 
            obj.calculateTotal()
    }
    calculateTotal(Invoice(100))
}

