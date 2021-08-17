interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("I'm focusable!")
}

class Button : Clickable, Focusable {

    // override 변경자는 자바의 @Override 애노테이션과 비슷함.
    override fun click() = println("I was clicked")
    // error: class 'Button' must override public open fun showOff(): 
    // Unit defined in Clickable because it inherits multiple interface methods of it

}

fun main() {
    Button().showOff()
}