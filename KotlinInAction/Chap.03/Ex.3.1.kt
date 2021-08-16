fun <T> joinToString (collection: Collection<T>, 
                      separator: String, 
                      prefix: String, 
                      postfix: String
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
    // 호출시 하나라도 이름 붙인 인자를 사용하면 
    // 그 뒤에 오는 모든 인자는 이름을 명시해야 함.
    println(joinToString(list, separator="; ", prefix="(", postfix=")"))

    // 자바 API는 이름 붙인 인자를 사용할 수 없다.
    // 코틀린은 Java 6과 호환이 되는데, 이름 붙인 인자는 Java 8부터 도입되었다고 함.
}
