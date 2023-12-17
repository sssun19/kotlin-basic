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

//    val list = listOf("a", "b", "c")
//    val printStr : (String) -> Unit = {println(it)}
//
//    forEachStr(list, printStr)
//
//    list.forEach(printStr)
//    list.map(printStr)
//
//    val upperCase : (String)-> String ={it.uppercase()}
//
//    println(list.map(upperCase))

    // 내부 함수 호출하려면 두 번 호출
    outerFunc()()

    // 또는 변수로 할당하고 변수(함수) 호출
    val func = outerFunc()
    func()

    outerFunc2()()

    arg1 {
        it.length
        it.first()
    }

    arg2 { a: String, b: String ->
        a.length
        b.first()
    }


    val callReference : () -> Unit = { printHello() }
    val callReference2 = :: printHello
    callReference2()()


    val numberList = listOf("1", "2", "3")
    numberList.map { it.toInt() }.forEach{println(it)}
    numberList.map(String::toInt).forEach(::println)

}


fun arg1(block: (String) -> Unit) {}
fun arg2(block: (String, String) -> Unit) {}


// 람다 표현식의 전체 식
val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
// 최대한 생략한 람다식
val sum2 = {x: Int, y: Int -> x + y}

fun outerFunc() : () -> Unit {
    return { println("이것은 익명함수!") }
}

fun outerFunc2() : () -> Unit = {println("이것은 익명함수!!")}

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
val printHello: () -> Unit ={println("Hello")}
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