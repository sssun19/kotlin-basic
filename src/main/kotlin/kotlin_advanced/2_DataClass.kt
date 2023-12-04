package kotlin_advanced

class Person (val name:String, val age: Int) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Person

        if (name != other.name) return false
        return age == other.age
    }

//    override fun hashCode(): Int {
//        var result = name.hashCode()
//        result = 31 * result + age
//        return result
//    }



}

fun main() {

    val person1 = Person("tony", 2)
    val person2 = Person("tony", 2)

    println(person1 == person2)
}