package algoritmos

fun main() {
    println("Número:")
    val numero = readln().trim().replace(',', '.').toDouble()
    println(when {
        numero > 0 -> "POSITIVO"
        numero < 0 -> "NEGATIVO"
        else -> "NULO"
    })
}
