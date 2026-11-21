package algoritmos

import kotlin.math.*

fun main() {
    println("Logaritmando:")
    val numero = readln().trim().replace(',', '.').toDouble()
    println(if (numero > 0) "Logaritmo: " + log10(numero) else "Logaritmando inválido.")
}
