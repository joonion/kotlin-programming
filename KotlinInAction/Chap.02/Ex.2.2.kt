fun main() {
    val question: String = "삶, 우주, 그리고 모든 것에 대한 궁극적인 질문"
    val answer: Int = 42
    println(question + ": 답은 " + answer)

    // 초기화를 한다면 타입 추론을 할 수 있음.
    val q = "삶, 우주, 그리고 모든 것에 대한 궁극적인 질문"
    val a = 42
    println("$q: 답은 $a")

    // val은 immutable 변수 var는 mutable 변수를 지정하는 키워드
    // 가급적이면 val을 사용하고 필요하면 var를 사용할 것.
    // 부수 효과(side effect)와 함수형 프로그래밍

    // 문자열 템플릿: String Template
    val pi = 3.141592653589
    println("가격은 \$$pi 입니다.")
    println("면적은 ${pi*10*10} 입니다.")
    val truth: Boolean = true
    println("원주율은 ${if (truth) pi else 0}입니다.")
}