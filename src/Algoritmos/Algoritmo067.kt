package algoritmos

fun main() {
    println("Valor da prestação:")
    val valor = readln().trim().replace(',', '.').toDouble()
    println("Taxa de juros em porcentagem:")
    val taxa = readln().trim().replace(',', '.').toDouble()
    println("Tempo de atraso:")
    val tempo = readln().trim().toInt()
    println("Prestação em atraso: R$ %.2f".format(valor + valor * (taxa / 100) * tempo))
}
