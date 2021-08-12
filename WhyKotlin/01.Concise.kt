            
fun main() {

    // POJO: Plain Old Java Objects
    // Crate a POJO class in a line.
    data class Customer(val name: String, 
                        val email: String, 
                        val company: String)
    val cust: Customer = Customer("홍길동", "hong@gil.dong", "율도국")
    println(cust)

    // Filter a list using a lambda expression.
    var list: ArrayList<Int> = ArrayList()
    list.add(-1)
    list.add(5)
    list.add(-3)
    list.add(8)
    val positiveNumbers = list.filter { it > 0 }
    for (i in list) print("$i ")
    println()
    for (i in positiveNumbers) print("$i ")
    println()

    // Want a Singleton? Just create an object.
    val companyName: String = "JetBrains"
    println(companyName)
}