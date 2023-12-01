package kotlin_basic

import java.lang.IllegalArgumentException

fun main() {

//    println("1초 전")
//    Thread.sleep(1000)
//    println("1초 후!")


    val bool = try {
        Thread.sleep(1000)
    } catch (e: Exception) {
        println("에러 발생!")
    } finally {
        println("finally 실행!")
    }

    println(bool)
    println("====================")

    val a = try {
        "1234".toInt()
    } catch (e: Exception) {
        println("예외 발생 !")
    }
    println(a)

//    throw Exception("예외 발생")

    val abc : String? = null
    val bcd = abc ?: failFast("abc is null")

    println("bcd.length" + bcd.length)
    //엘비스 연산자와 nothing 타입을 같이 사용하는 경우 null 이 나올 수 없기 때문에 ?연산자 사용하지 않아도 됨

//    failFast("예외가 발생했습니다.")

//    println("이 메시지는 출력 될까?")         unreachable code
}

fun failFast(message: String) : Nothing {
    throw IllegalArgumentException(message)
} //throw를 반환하면 Nothing 타입이 반환