package kotlin_advanced

fun String.first() : Char {
    return this[0]
}

fun String.addFirst(char: Char) : String {
    return char + this.substring(0)
}

class MyExample {
    fun printMessage() = println("클래스 출력")
}

fun MyExample.printMessage(message: String) = println(message)

fun MyExample?.printNullOrNotNull() {
    if (this == null) println("널인 경우에만 출력")
    else println("널이 아닌 경우에만 출력")
}

fun main() {

    //시그니쳐가 같으면 멤버 메서드 우선
    MyExample().printMessage()
    MyExample().printMessage("확장 출력")

    println("ABC".first())

    println("ABCD".addFirst('Z'))

    var myExample: MyExample? = null
    myExample.printNullOrNotNull() //안전연산자 ?. 를 사용하지 않았지만 printNullOrNotNull 메서드 내부에서 null에 대한 처리를 하고 있기 때문

    myExample = MyExample()
    myExample.printNullOrNotNull()


}