fun <T> joinToString (collection: Collection<T>, 
                      separator: String = ", ", 
                      prefix: String = "[", 
                      postfix: String = "]"
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun main() {
    val list = listOf("A", "B", "C")
    println(joinToString(list))
    println(joinToString(list, separator="; "))
    println(joinToString(list, separator="; ", prefix="(", postfix=")"))
    println(joinToString(list, prefix="(", postfix=")"))
}
