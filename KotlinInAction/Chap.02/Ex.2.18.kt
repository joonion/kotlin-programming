// 스마트 캐스팅: Smart Casting 
// 일단 is로 타입 검사를 하면 컴파일러가 자동으로 타입 캐스팅을 해줌.
// 원하는 타입으로 명시적으로 타입 캐스팅을 하려면 as 키워드를 사용한다.

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int {
    if (e is Num) {
        // val n = e as Num // 불필요한 중복이기에 없어도 됨.
        // return n.value
        return e.value
    }
    if (e is Sum) {
        return eval(e.right) + eval(e.left)
    }
    throw IllegalArgumentException("Unknown Expression")
}

fun main() {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
}