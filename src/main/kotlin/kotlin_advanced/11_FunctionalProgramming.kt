package kotlin_advanced

import java.util.Objects

// FP : 함수형 프로그래밍 (깔끔하고 유지보수가 용이한 프로그래밍)
fun main() {

//    val list = mutableListOf(printHello)
//
//    val func = list[0]
//    func()

//    call(printHello)

//    val func = printNo
//    val list = mutableListOf(printNo)
//    call(printNo)

//    val result = plus(1,3,5)
//    println(result)

    val list = listOf("a", "b", "c")
    val printStr : (String) -> Unit = {println(it)}

    forEachStr(list, printStr)
}


fun forEachStr(collection: Collection<String>, action: (String)->Unit) {
    for (item in collection) {
        action(item)
    }
}


//val printMessage: (String) -> Unit = { message: String-> println(message)}
//val printMessage2: (String) -> Unit = { message-> println(message)}
//val printMessage3: (String) -> Unit = { println(it) }

//val plus: (Int, Int, Int) -> Int = {a, b, c -> a + b + c}
//
//
//val printHello: () -> Unit ={println("Hello")}
//
////val func : () -> Unit = {}
////val func : () -> String = {""}
//
//// 함수를 인자로 받아 실행하는 함수
//fun call(block: ()->Unit) {
//    block()
//}
//
//fun printNo() = println("No!")