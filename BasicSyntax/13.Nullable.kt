// A reference must be explicitly marked as nullable
// when null value is possible with ? at the end.


fun parseInt(str: String): Int? {
    if (str.isEmpty()) {return null}
    else return Integer.parseInt(str)    
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)
    // println("${x + y}")
    // error: operator call corresponds to a dot-qualified call 'x.plus(y)' which is not allowed on a nullable receiver 'x'.

    if (x != null && y != null)
        println("${x + y}")
    else 
        println("One of them is null.")
}

fun main() {
    printProduct("123", "45")        
    // printProduct("123", null)         
    // error: null can not be a value of a non-null type String
    printProduct("123", "")
}