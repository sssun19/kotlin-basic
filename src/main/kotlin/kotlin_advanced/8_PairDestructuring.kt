package kotlin_advanced

// f((1,3)) = 1 + 3 = 4
// f(1,3) = 1 + 3 = 4

//data class Tuple(val a : Int, val b: Int)

fun plus(pair : Pair<Int, Int>) = pair.first + pair.second

fun main() {
    val plus = plus(Pair(1,3))
    println(plus)

    val pair = Pair("A", 1)
    val newPair = pair.copy(first="B")

    println(newPair)

    val second = newPair.component2()
    println(second)

    val list = newPair.toList()
    val mutableList = mutableListOf(list)
    mutableList.add(list)
    println(list)
    println(mutableList)

    val triple = Triple("A", "B", "C")
    println(triple)
    triple.first
    triple.second
    triple.third

    val newTriple = triple.copy(third="D")
    println(newTriple)

    // 코틀린의 구조 분해 할당
    val (a: String, b: String, c: String) = newTriple
    println("$a, $b, $c")
    // 구조 분해 할당을 자바 문법으로 디컴파일
    //      String a = (String)newTriple.component1();
    //      String b = (String)newTriple.component2();
    //      String c = (String)newTriple.component3();
    //      String var11 = a + ", " + b + ", " + c;

    val list3: List<String> = newTriple.toList()
    val (a1, a2, a3) = list3
    println("$a1, $a2, $a3")

    val map = mutableMapOf("이상훈" to "개발자")
    for ( (key, value) in map ) {
        println("${key}의 직업은 ${value}입니다.")
    }

    // to 중위표현식으로 key, value 설정 => 내부 코드에선 Pair 사용
    // val map = mutableMapOf(Pair("이상훈", "개발자"))

}