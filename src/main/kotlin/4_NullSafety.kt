import java.lang.NullPointerException

fun getNullStr() : String? = null

fun getLengthIfNotNull(str : String?) = str?.length ?: 0

fun main() {

//    val a : String = null
//    var b : String = "aabbcc"
//    b = null

    val a : String? = null
    println(a?.length)

    val b : Int = if (a != null) a.length else 0
    println("b : " + b)

    // 엘비스 연산자
    val c = a?.length ?: 0 //좌변이 null인 경우 우변을 리턴
    println("c : " + c)


    val nullableStr = getNullStr()

    val nullableStrLength = nullableStr?.length ?: "null인 경우 반환".length
    println(nullableStrLength)

    val length = getLengthIfNotNull(null )
    println(length)

    // NPE 가 발생하는 코틀린 코드
    //throw NullPointerException()     throw로 에러 강제 발생

//    val d : String? = null
//    val e = d!!.length        !! 단언 연산자로 null값을 null이 아니라고 단언하면 NPE

    // Java 코드를 코틀린으로 바꿀 땐 nullable 체크 필수!
    println(Java_NullSafety.getNullStr()?.length ?: 0)

}