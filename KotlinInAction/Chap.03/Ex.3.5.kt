open class View {
    open fun click() = println("View clicked")
}

// Button 클래스는 View 클래스를 상속하고
class Button : View() {
    // Button 클래스가 click() 메소드를 오버라이드한 경우
    override fun click() = println("Button clicked")
}

fun main() {
    val view: View = Button()
    // view 객체 참조 변수의 객체 인스턴스가 Button 인스턴스이므로
    // 동적 디스패치에 의해서 Button 클래스의 click() 함수가 호출됨.
    view.click()

    // 하지만 확장 함수는 그렇게 안된다고 한다.
}