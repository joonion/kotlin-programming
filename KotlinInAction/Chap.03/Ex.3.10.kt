fun parsePath(path: String) {
    // 3중 따옴표를 쓰면 . 문자를 이스케이프할 필요가 없다. 
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if (matchResult != null) {
        // 구조 분해 프로퍼티 destructured로 3개의 변수에 한꺼번에 할당.
        val (dir, fileName, ext) = matchResult.destructured
        println("Directory: $dir, Filename: $fileName, Filetype: $ext")
    }
}

fun main() {
    parsePath("/home/joonion/code/kotlin.kt")
}