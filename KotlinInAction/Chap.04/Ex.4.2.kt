interface Clickable {
    fun click()
}

class Button : Clickable {

    // override 변경자는 자바의 @Override 애노테이션과 비슷함.
    override fun click() = println("I was clicked")
}

fun main() {
    Button().click()
}