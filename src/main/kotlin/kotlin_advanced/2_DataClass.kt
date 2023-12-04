package kotlin_advanced

data class Person (val name:String, val age: Int) {

}

fun main() {

    val person1 = Person("tony", 2)
    val person2 = Person("tony", 2)

    println(person1 == person2)
}