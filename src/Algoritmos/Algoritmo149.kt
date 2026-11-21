package algoritmos

fun main() {
    println("Valor de compra:")
    val compra = readln().trim().replace(',', '.').toDouble()
    val lucro = when {
        compra < 10 -> 0.70
        compra < 30 -> 0.50
        compra < 50 -> 0.40
        else -> 0.30
    }
    println("Valor de venda: R$ %.2f".format(compra * (1 + lucro)))
}
