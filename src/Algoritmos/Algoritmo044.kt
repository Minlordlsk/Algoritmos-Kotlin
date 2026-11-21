package algoritmos

import kotlin.math.*

fun main() {
    println("Logaritmando:")
    val numero = readln().trim().replace(',', '.').toDouble()
    println("Base:")
    val base = readln().trim().replace(',', '.').toDouble()
    println(if (numero > 0 && base > 0 && base != 1.0) "Logaritmo: " + ln(numero) / ln(base) else "Logaritmando ou base inválida.")
}
