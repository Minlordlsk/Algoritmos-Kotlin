package algoritmos

fun main() {
    println("Valor do produto:")
    val preco = readln().trim().replace(',', '.').toDouble()
    println("Preço com desconto: R$ %.2f".format(preco * 0.91))
}
