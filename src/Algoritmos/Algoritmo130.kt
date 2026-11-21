package algoritmos

fun main() {
    println("Valor de compra:")
    val compra = readln().trim().replace(',', '.').toDouble()
    val lucro = if (compra < 20) 0.45 else 0.30
    println("Valor de venda: R$ %.2f".format(compra * (1 + lucro)))
}
