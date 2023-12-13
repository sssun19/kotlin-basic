package kotlin_advanced

// 가변 프로퍼티의 지연 초기화
class `7 LateInit` {

    lateinit var text: String

    val textInitialized: Boolean
        get() = this::text.isInitialized

    fun printText() {
//        if (this::text.isInitialized) {
//            println("초기화 됨")
//        } else {
//            text = "안녕하세요"
//        }
        println(text)

    }
}

fun main() {

    val test = `7 LateInit`()
//    test.text = "하이요"

    if (!test.textInitialized) {
        test.text = "하이요"
    }

    test.printText()
}