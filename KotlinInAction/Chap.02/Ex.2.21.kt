// 스마트 캐스팅: Smart Casting 
// 일단 is로 타입 검사를 하면 컴파일러가 자동으로 타입 캐스팅을 해줌.
// 원하는 타입으로 명시적으로 타입 캐스팅을 하려면 as 키워드를 사용한다.

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun evalWithLogging(e: Expr): Int = when (e) {
    is Num -> {
        println("num: ${e.value}")
        e.value
    }
    is Sum -> {
        val left = evalWithLogging(e.left)
        val right = evalWithLogging(e.right)
        println("sum: $left + $right")
        left + right
    }
    else   -> throw IllegalArgumentException("Unkown expression")
} 

fun main() {
    println(evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))))
}
