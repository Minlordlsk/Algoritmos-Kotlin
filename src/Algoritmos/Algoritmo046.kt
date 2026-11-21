package algoritmos

fun main() {
    println("Saldo da aplicação:")
    val saldo = readln().trim().replace(',', '.').toDouble()
    println("Novo saldo: %.2f".format(saldo * 1.01))
}
