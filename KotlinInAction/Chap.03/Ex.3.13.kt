class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    // 로컬 함수: 함수 안에 함수 선언 가능.
    fun validate(value:String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user ${user.id}: empty $fieldName")
        }
    }
    validate(user.name, "Name")
    validate(user.address, "Name")
    
    println("save user to the database here")
}

fun main() {
    saveUser(User(1, "Joonion", "KNU"))
}