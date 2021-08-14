fun main() {
    class Person(name: String, age: Int)
    val person = Person("joonion", 24)
    val (name, age) = person
    println(name)
    println(age)
}