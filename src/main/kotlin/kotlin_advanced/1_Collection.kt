package kotlin_advanced

import java.util.LinkedList
import java.util.stream.Collectors

fun main() {

    // immutable
    val currencyList = listOf("달러", "유로", "원") //listOf ==> list 를 만들어주는 팩토리 함수
//    println(currencyList.get(0))
//    currencyList.add() // immutable 이기 때문에 추후에 생성,삭제 불가능


    // mutable
//    val mutableCurrencyList = mutableListOf<String>() // list.add 함수로 추가
//    mutableCurrencyList.add("달러")
//    mutableCurrencyList.add("유로")
//    mutableCurrencyList.add("원")

    // apply 함수로 가독성 높이기
    val mutableCurrencyList: MutableList<String> = mutableListOf<String>().apply {
        this.add("달러")
        add("유로")
        add("원")
    }

    mutableCurrencyList.add("파운드")

    // immutable set
    val numberSet = setOf(1, 2, 3, 4)

    // mutable set
    val mutableSet = mutableSetOf<Int>().apply {
        add(1)
        add(2)
        add(3)
        add(4)
    }

    // immutable map
    val numberMap = mapOf("one" to 1, "two" to 2) //to 중위표현식 key,value 셋팅

    // mutable map
    val mutableNumberMap = mutableMapOf<String,Int>().apply {
        put("one", 1)
        put("two", 2)
    }
    mutableNumberMap["three"] = 3

    for (i in mutableNumberMap) {
        println("key = "+ i.key + " & value = " + i.value)
    }

    // collection builder 컬렉션 빌더 (내부에선 mutable, 반환은 immutable)
    val numberList: List<Int> = buildList {
        add(1)
        add(2)
        add(3)
        add(4)
    }

//    numberList.add() => buildList 내부에서는 mutable list 로 생성했으나 반환하는 타입이 immutable list 라서 리스트 생성 이후 add 함수 따로 호출 불가

    // linkedList
    val linkedList = LinkedList<Int>().apply {
        addFirst(3)
        add(2)
        addLast(1)
    }

    // arrayList
    val arrayList = ArrayList<Int>().apply {
        add(1)
        add(2)
        add(3)
    }

    val iterator = currencyList.iterator()
    while(iterator.hasNext()) {
        println(iterator.next())
    }

    println("====================")

    for (currency in currencyList) {
        println(currency)
    }

    println("=====================")

    currencyList.forEach {
        println(it)
    }

    // for loop -> map
    val lowerList = listOf("a", "b", "c")
//    val upperList = mutableListOf<String>()

//    for (lowerCase in lowerList) {
//        upperList.add(lowerCase.uppercase())
//    }
//
//    println(upperList)

    val upperList = lowerList.map { it.uppercase() }
    println(upperList)

    // filter
//    val filteredList = mutableListOf<String>()
//    for (upperCase in upperList) {
//        if (upperCase == "A" || upperCase == "C") {
//            filteredList.add(upperCase)
//        }
//    }

//    val filteredList = upperList.stream().filter { it =="A" || it=="C" }.collect(Collectors.toList())
    val filteredList = upperList.filter { it == "A" || it == "C" }.find { it =="C" }
    println(filteredList)

    // filter 체인이 너무 길어지면 메모리 낭비가 심해질 수 있으므로 대용량 데이터를 다룰 때는 asSequence() 함수를 사용하는 것이 적합
    // filter 가 아무리 많아져도 toList()가 최종적으로 동작할 때 최종 컬렉션을 생성하기 때문에 메모리 이슈를 줄일 수 있다.
    val filteredList2 = upperList.asSequence().filter { it=="A" || it=="C" }.toList()


}