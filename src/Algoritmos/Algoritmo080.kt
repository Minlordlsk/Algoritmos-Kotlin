package algoritmos

fun main() {
    println("Quantidade de fitas:")
    val quantidade = readln().trim().toInt()
    println("Valor do aluguel:")
    val preco = readln().trim().replace(',', '.').toDouble()
    val alugadas = quantidade / 3.0
    println("Faturamento anual: R$ %.2f".format(alugadas * preco * 12))
    println("Multas por mês: R$ %.2f".format(alugadas / 10 * preco * 0.1))
    println("Quantidade de fitas no fim do ano: " + quantidade * 1.08)
}
