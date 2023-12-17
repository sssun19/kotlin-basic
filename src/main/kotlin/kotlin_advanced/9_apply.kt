package kotlin_advanced

// apply :: 수신 객체의 프로퍼티를 구성하고 수신 객체의 결과를 그대로 반환하고 싶을 때 사용
fun main() {

    val client = DatabaseClient().apply {
        this.url = "localhost:3306"
        username = "mysql"
        password = "1234"

    }

//    val connected = client.connect()
//    println(connected)

    client.connect().run {
        println(this)
    }


//    DatabaseClient().apply {
//        url = "localhost:3306"
//        username = "mysql"
//        password = "1234"
//
//    }.connect().run {
//        println(this)
//    }
}