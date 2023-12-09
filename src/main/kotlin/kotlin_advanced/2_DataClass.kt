package kotlin_advanced

data class Person (val name:String, val age: Int) {

//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (javaClass != other?.javaClass) return false
//
//        other as Person
//
//        if (name != other.name) return false
//        return age == other.age
//    }
//
//    override fun hashCode(): Int {
//        var result = name.hashCode()
//        result = 31 * result + age
//        return result
//    }

}

fun main() {

    val person1 = Person("tony", 2)
    val person2 = Person("hoshi", 7)

    val (name, age) = person2 //구조분해 할당

    val person3 = person1.copy(name="strange", age=3)

    println("이름=${person1.name}, 나이=${person1.component2()}")
    println("name = ${name}, age = ${age}")

    println(person1.toString())

    println(person1 == person2)

    val set = hashSetOf(person1)
    println(set.contains(person2))

//    person1.name = "strange"
//    println("==="+ set.contains(person1))

    println(person3)
}