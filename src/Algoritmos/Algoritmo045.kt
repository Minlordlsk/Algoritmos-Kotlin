package algoritmos

import kotlin.math.*

fun main() {
    println("Número:")
    val numero = readln().trim().replace(',', '.').toDouble()
    println("Número: $numero")
    println("Quadrado: " + numero * numero)
    println(if (numero >= 0) "Raiz quadrada: " + sqrt(numero) else "Raiz quadrada não real.")
}
