package kotlin_advanced

sealed class Developer {

    abstract val name: String
    abstract fun code(language: String)

}

data class BackendDeveloper(override val name:String) : Developer() {
    override fun code(language: String) {
        println("저는 백엔드 개발자입니다 ${language}를 사용합니다.")
    }
}

data class FrontendDeveloper(override val name: String) : Developer() {
    override fun code(language: String) {
        println("저는 프론트엔드 개발자입니다 ${language}를 사용합니다.")
    }
}

object DeveloperPool {
    val pool = mutableMapOf<String, Developer>()

    fun add(developer: Developer) = when(developer) {
        is BackendDeveloper -> pool[developer.name] = developer
        is FrontendDeveloper -> pool[developer.name] = developer
    }

    fun get(name: String) = pool[name]

}

fun main(){

    val backendDeveloper = BackendDeveloper(name="sssun")
    DeveloperPool.add(backendDeveloper)

    val frontendDeveloper = FrontendDeveloper(name="hoshi")
    DeveloperPool.add(frontendDeveloper)

    println(DeveloperPool.get("sssun"))
    println(DeveloperPool.get("hoshi"))
}