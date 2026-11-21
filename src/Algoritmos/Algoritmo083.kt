package algoritmos

import kotlin.math.*

fun main() {
    println("Número:")
    val numero = readln().trim().replace(',', '.').toDouble()
    println(if (numero > 0) "Inverso: " + 1 / numero else "Valor absoluto: " + abs(numero))
}
