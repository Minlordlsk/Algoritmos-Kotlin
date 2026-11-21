package algoritmos

fun main() {
    println("Tipo do carro (A/B/C):")
    val tipo = readln()
    println("Percurso em quilômetros:")
    val percurso = readln().trim().replace(',', '.').toDouble()
    val rendimento = when (tipo.trim().uppercase()) {
        "A" -> 8
        "B" -> 9
        "C" -> 12
        else -> 0
    }
    println(if (rendimento == 0) "Modelo inexistente." else "Consumo estimado: %.2f L".format(percurso / rendimento))
}
