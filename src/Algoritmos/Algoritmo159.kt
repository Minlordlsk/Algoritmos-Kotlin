package algoritmos

import kotlin.math.*

fun main() {
    println("Valor de x:")
    val x = readln().trim().replace(',', '.').toDouble()
    println(if (abs(x) <= 4) "f(x) não é definida para este valor." else "f(x) = " + (5 * x + 3) / sqrt(x * x - 16))
}
