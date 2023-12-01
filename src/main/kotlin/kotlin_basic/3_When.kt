package kotlin_basic

fun main(){

    // 자바 코드를 코틀린의 when 식으로 변환한 코드
    val day = 2

    var result = when (day) {
        1 -> "월요일"
        2 -> "화요일"
        3 -> "수요일"
        4 -> "목요일"
        5 -> "금요일"
        else -> "주말"
    }
    println(result)

    // else를 생략할 수 있다
    when(getColor()) {
        Color.RED -> println("red")
        Color.GREEN -> println("green")
        //else -> println("blue")
    }


    // 여러개의 조건을 콤마로 구분해 한줄에서 정희할 수 있다
    when (getNumber()) {
        0, 1 -> println("0 또는 1")
        else -> println("0 또는 1이 아님")
    }
}

enum class Color {
    RED, GREEN,//BLUE
}

fun getColor() = Color.RED

fun getNumber() = 2