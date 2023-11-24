
open class Dog {
    open var age: Int = 0

    open fun bark() {
        println("멍멍")
    }
}    //open class == 상속이 가능한 클래스


open class Bulldog(final override var age: Int = 0) : Dog() { //클래스 상속 받는 방법

    //상위 클래스 오버라이드(재정의)
    override fun bark() {
        super.bark()
        println("컹컹")
    }
}

abstract class Developer {

    abstract var age : Int
    abstract fun code(language: String)
}

class BackendDeveloper(override var age: Int) : Developer() {

    override fun code(language: String) {
        println("I code with $language")
    }
}

class ChildBulldog : Bulldog() {
//    override var age: Int = 0
    override fun bark() {
        println("낑낑")
    }
}

fun main(){
    val dog = Bulldog(age = 2)
    println(dog.age)
    dog.bark()

    val childDog = ChildBulldog()
    println(childDog.age)
    childDog.bark()


    val backendDeveloper = BackendDeveloper(age=26)
    println(backendDeveloper.age)
    backendDeveloper.code("kotlin")
}