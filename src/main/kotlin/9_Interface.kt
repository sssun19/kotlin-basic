
class Product(val name:String, val price: Int)

interface Wheel {
    fun roll()
}

interface Cart : Wheel {

    var coin: Int

    val weight : String
        get() = "20KG"

    fun add(product: Product) {
//        println("Cart 인터페이스의 add 함수.")
    }

    fun rent() {
        if (coin > 0) {
            println("카트를 대여합니다.")
        }
    }

    override fun roll() {
        println("카트가 굴러갑니다")
    }

    fun printId() = println("1234")

}

interface Order {
    fun add(product : Product) {
        println("${product.name} 주문이 완료 되었습니다. 가격은 ${product.price}원 입니다.")
    }

    fun printId() = println("5678")
}

class MyCart(override var coin: Int) : Cart, Order {

    override fun add(product: Product) {
        if (coin <= 0) println("코인을 넣어주세요.")
        else println("${product.name}이(가) 카트에 추가됐습니다.")

        // 주문하기
//        super<Cart>.add(product)
        super<Order>.add(product)
    }

    override fun printId() {
        super<Cart>.printId()
        super<Order>.printId()
    }

}
fun main() {

    var cart = MyCart(coin=100)
    cart.rent()
    cart.roll()
    cart.add(Product(name="장난감", price=1000))
    cart.printId()
}