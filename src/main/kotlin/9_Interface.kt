
class Product(val name:String, val price: Int)

interface Cart {

    var coin: Int

    val weight : String
        get() = "20KG"

    fun add(product: Product)

    fun rent() {
        if (coin > 0) {
            println("카트를 대여합니다.")
        }
    }
}

class MyCart(override var coin: Int) : Cart {

    override fun add(product: Product) {
        if (coin <= 0) println("코인을 넣어주세요.")
        else println("${product.name}이(가) 카트에 추가됐습니다.")
    }

}
fun main() {

    var cart = MyCart(coin=100)
    cart.rent()
    cart.add(Product(name="장난감", price=1000))
}