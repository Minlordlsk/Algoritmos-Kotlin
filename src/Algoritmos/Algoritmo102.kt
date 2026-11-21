package algoritmos

fun main() {
    println("Número:")
    val numero = readln().trim().replace(',', '.').toDouble()
    println(when {
        numero > 20 -> "Maior do que 20"
        numero < 20 -> "Menor do que 20"
        else -> "Igual a 20"
    })
}
