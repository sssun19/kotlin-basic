package kotlin_advanced

//with : 결과 반환 없이 내부에서 수신 객체를 이용해 다른 함수를 호출할 때 사용
fun main() {

    val str = "안녕하세요"

    with(str) {
        println("length = $length")
    }

}