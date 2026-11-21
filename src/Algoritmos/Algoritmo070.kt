package algoritmos

fun main() {
    println("Valor das despesas:")
    val conta = readln().trim().replace(',', '.').toDouble()
    println("Total com gorjeta: R$ %.2f".format(conta * 1.1))
}
