package algoritmos

fun main() {
    println("Valor em reais:")
    val reais = readln().trim().replace(',', '.').toDouble()
    println("F Franco suíço, L Libra esterlina, D Dólar, M Marco alemão:")
    val moeda = readln()
    val destino = when (moeda.trim().uppercase()) {
        "F" -> "franco suíço"
        "L" -> "libra esterlina"
        "D" -> "dólar"
        "M" -> "marco alemão"
        else -> {
            println("Moeda desconhecida.")
            return
        }
    }
    println("Valor de uma unidade de $destino em reais:")
    val cambio = readln().trim().replace(',', '.').toDouble()
    println(if (cambio > 0) "Total em $destino: %.2f".format(reais / cambio) else "Cotação inválida.")
}
