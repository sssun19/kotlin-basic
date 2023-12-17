package kotlin_advanced

fun main() {

    val str: String? = "안녕"

//    val result: Int? = str?.let {
//        println(it)
//
//        val abc: String? = "abc"
//        abc?.let {
//            val def : String? = "def"
//            def?.let {
//                println("abcdef가 null 아님")
//            }
//        }
//
//        1234// let 스코프 함수는 마지막 코드가 자동 반환이므로 return 사용x
//    }

    // 스코프 함수는 depth가 깊어질 수록 if-else 구문을 사용하는 것이 가독성을 높일 수 있음

    val result: Int? = str?.let {
        println(it)

        val abc: String? = "abc"
        val def: String? = "def"

        if (!abc.isNullOrBlank() && !def.isNullOrBlank()) {
            println("abcdef가 null 아님")
        }

        1234
    }

    println(result)
}