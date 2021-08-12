/*
 * https://play.kotlinlang.org/byExample/01_introduction/02_Functions
 */

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) { likedPeople.add(other) }
    override fun toString() = "$name"
}

fun main() {
    // Infix functions can be called using the infix notation.
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye ")

    // "to" is an infix function from the standard library.
    val pair = "Ferrari" to "Katrina"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Cloudia")
    sophia likes claudia
    sophia likes Person("Lawrence")

    // Check the list of sophia's likedPeople
    print("$sophia's likedPeople is")
    val it = sophia.likedPeople.iterator()
    while(it.hasNext()) {
        val person = it.next()
        print(", $person")
    }
    println()

    // Using for-loop to iterate the List of likedPeople
    print("$sophia's likedPeople is")
    for (person in sophia.likedPeople) {
        print(", $person")
    }
    println()
}
