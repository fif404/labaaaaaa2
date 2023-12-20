open class Product(val name: String, val price: Double, val weight: Double) {
    open fun getInfo() {
        println("$name - Цена: $price руб., Вес: $weight г")
    }
}

class VitaminCProduct(name: String, price: Double, weight: Double, val vitaminC: Double) : Product(name, price, weight) {
    override fun getInfo() {
        super.getInfo()
        println("Содержание витамина C: $vitaminC мг/г")
    }
}

fun main() {
    val apple = VitaminCProduct("Яблоко", 50.0, 150.0, 5.0)
    apple.getInfo()

    val orange = VitaminCProduct("Апельсин", 60.0, 200.0, 30.0)
    orange.getInfo()
}