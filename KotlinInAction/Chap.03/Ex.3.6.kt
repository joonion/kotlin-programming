open class View
class Button : View()

fun main() {
    fun View.showOff() = println("I'm a view!")
    fun Button.showOff() = println("I'm a button!")
    val view1 = Button()
    view1.showOff()

    // 확장 함수는 오버라이드할 수 없다. 
    val view2: View = Button()
    view2.showOff()

    // 확장 함수는 첫 번째 인자가 수신 객체인 정적 자바 메소드로 컴파일한다.
    // View view = new Button();
    // ExtenstionKt.showOff(view);
}
