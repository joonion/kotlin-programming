// Example: CodeForces Contests 1157: Problem B. Long Number
// https://codeforces.com/contest/1157/problem/B

fun main() {

    // read inputs
    val n = readLine()!!.toInt()
    val s = readLine()!!.toString()
    val fl = readLine()!!.split(" ").map { it.toInt() }
    if (fl.size != n) println("Oops!")

    // define local function f
    fun f(c: Char) = '0' + fl[c - '1']

    // greedily find first and last indices
    val i = s.indexOfFirst { c -> f(c) > c - 1 }
        .takeIf { it >= 0 } ?: s.length
    val j = s.withIndex().indexOfFirst { (j, c) -> j > i && f(c) < c }
        .takeIf { it >= 0 } ?: s.length

    // compose and write the answer
    val ans = s.substring(0, i) + 
              s.substring(i, j).map { c -> f(c) }.joinToString("") + 
              s.substring(j)
    println(ans)
}