package kotlin_advanced

class HelloBot {

    val greeting: String by lazy { // by lazy(LazyThreadSafetyMode.NONE) 인자로 받으면 멀티 스레드 비동기화 가능, LazyThreadSafetyMode.PUBLICATION,...
        println("초기화 로직 수행")
        // by lazy 로 선언한 내부 수행 로직은 일회성이기 때문에 getHello() 메서드로 초기화한 "안녕하세요" 구문만 계속해서 찍히고 println() 내부 로직은 처음 1회만 수행
        getHello()
    }

    fun sayHello() = println(greeting)

}

fun getHello() = "안녕하세요"

fun main() {

    val helloBot = HelloBot()

    // ...
    // ... 특정 로직 수행 이후

    for (i in 1..5) {
        Thread{
            helloBot.sayHello()
        }.start()
    } // 멀티 스레드 환경에서도 안전하게 로직 수행

//    helloBot.sayHello()
//    helloBot.sayHello()
//    helloBot.sayHello()

    // 지연할당을 사용하려면 어쩔 수 없이 변수를 가변변수(var)로 선언해야 하는 문제점이 있다.
    // 이를 해결하기 위해 by lazy {} 불변을 유지하면서 변수 지연초기화 가능 (by lazy는 불변 변수로 선언해야만 한다)
}