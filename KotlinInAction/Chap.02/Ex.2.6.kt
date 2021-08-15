class Person(val name:String, val isMarried: Boolean)

fun main() {
    val person = Person("주니온", true)
    println("${person.name}은 결혼${if (person.isMarried) "했어요." else "안했어요"}")
}