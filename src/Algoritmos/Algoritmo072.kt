package algoritmos

fun main() {
    println("Valor do depósito:")
    val deposito = readln().trim().replace(',', '.').toDouble()
    println("Taxa de juros em porcentagem:")
    val taxa = readln().trim().replace(',', '.').toDouble()
    val rendimento = deposito * taxa / 100
    println("Rendimento: R$ %.2f".format(rendimento))
    println("Total: R$ %.2f".format(deposito + rendimento))
}
