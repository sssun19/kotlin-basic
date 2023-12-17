package kotlin_advanced

class User(val name:String, val password: String) {
    
    fun validate() {
        if (name.isNotEmpty() && password.isNotEmpty()) {
            println("검증 성공!")
        } else {
            println("검증 실패!")
        }
    }

    fun printName() = println(name)
}

fun main() {

    User(name="tony", password="1234").also {
        it.validate()
        it.printName()
    }

    val userNick = User(name="sssun", password="kimsuna").run {
        this.validate()
        this.printName()

        "sssun19"
    }

    println(userNick)
}