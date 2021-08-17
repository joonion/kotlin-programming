class User(val id: Int, val name: String, val address: String)

// 확장 함수로 검증 로직을 구현하기
fun User.validateBeforeSave() {
    fun validate(value:String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user $id: empty $fieldName")
        }
    }
    validate(name, "Name")
    validate(address, "Name")
}

fun saveUser(user: User) {
    user.validateBeforeSave()
    println("save user to the database here")
}

fun main() {
    saveUser(User(1, "Joonion", "KNU"))
}