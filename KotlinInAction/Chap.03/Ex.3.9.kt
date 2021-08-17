fun parsePath(path: String) {
    val dir = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val ext = fullName.substringAfterLast(".")

    println("Directory: $dir, Filename: $fileName, Filetype: $ext")
}

fun main() {
    parsePath("/home/joonion/code/kotlin.kt")
}