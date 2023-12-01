package kotlin_basic
class Coffee(
    var name: String = "아이스 커피",
    var price : Int = 200,
    var iced : Boolean = false,
    ) {

    //커스텀 getter setter 만들어보기
    val brand : String
        get() = "스타벅스"

    var quantity : Int = 3
        set(value) {
            if (value>0) { // 수량이 0 이상인 경우에만 할당
                field = value
            }
        }
}

class EmptyClass

fun main() {

    val coffee = Coffee()
    coffee.name = "아이스 아메리카노"
    coffee.price = 2000
    coffee.quantity = 1
    coffee.iced = true

    if (coffee.iced) println("아이스 커피")

    println("${coffee.name}의 가격은 ${coffee.price}원 입니다. 브랜드는 ${coffee.brand} 입니다. 남은 수량은 ${coffee.quantity}잔 입니다.")
}