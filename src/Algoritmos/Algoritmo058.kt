package algoritmos

import kotlin.math.*

fun main() {
    println("Primeiro valor:")
    val a = readln().trim().replace(',', '.').toDouble()
    println("Segundo valor:")
    val b = readln().trim().replace(',', '.').toDouble()
    println("Terceiro valor:")
    val c = readln().trim().replace(',', '.').toDouble()
    val denominador = c + a
    if (denominador == 0.0) {
        println("Divisão por zero.")
    } else {
        val x = a + b / denominador + 2 * (a - b) + ln(64.0) / ln(2.0)
        println("x = $x")
    }
}
