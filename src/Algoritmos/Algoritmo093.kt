package algoritmos

import kotlin.math.*

fun main() {
    println("Número:")
    val numero = readln().trim().replace(',', '.').toDouble()
    if (numero > 0) println("Raiz quadrada: " + sqrt(numero))
    if (numero < 0) println("Quadrado: " + numero * numero)
}
