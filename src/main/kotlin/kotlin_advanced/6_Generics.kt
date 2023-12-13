package kotlin_advanced

class MyGenerics<out T>(val t: T) {

}

class Bag<T> {

    private val items: MutableList<T> = mutableListOf()

    fun saveAll(
        to: MutableList<in T>,
        from: MutableList<T>,
    ) {
        //items.addAll(to)
        //items.addAll(from)
        to.addAll(from)
    }

    fun getItems(): List<T> {
        return items.toList()
    }

}

fun main() {

    // 제네릭을 사용한 클래스의 인스턴스를 만들려면 타입 아규먼트를 제공
    val generics = MyGenerics<String>("테스트")
    val charGenerics: MyGenerics<CharSequence> = generics

    val bag = Bag<String>()
    bag.saveAll(mutableListOf<CharSequence>("1", "2"), mutableListOf<String>("3","4"))

//    val itemsInBag = bag.getItems()
//    println(itemsInBag)


    //val generics = MyGenerics("테스트")// 어차피 인자로 String 타입을 받기 때문에 <T> 에 String 자동 추론 가능

    // 변수의 타입에 제네릭을 사용한 경우
//    val list1: MutableList<String> = mutableListOf()
//
//    //타입 아규먼트를 생성자에서 추가
//    val list2 = mutableListOf<String>()
//
//    val list3 : List<*> = listOf<String>("테스트")
//    val list4 : List<*> = listOf<Int>(1,2,3,4)

    // PECS (Producer-Extends, Consumer-Super)
    // 공변성은 자바 제네릭의 extends 코틀린에선 out
    // 반공변성은 자바 제네릭의 super 코틀린에선 in

}