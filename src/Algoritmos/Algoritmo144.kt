package algoritmos

fun main() {
    println("Saldo médio:")
    val saldo = readln().trim().replace(',', '.').toDouble()
    val percentual = when {
        saldo <= 500 -> 0.0
        saldo <= 1000 -> 0.30
        saldo <= 3000 -> 0.40
        else -> 0.50
    }
    println("Saldo médio: R$ %.2f".format(saldo))
    println("Crédito a juros de 2%%: R$ %.2f".format(saldo * percentual))
}
