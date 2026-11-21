package algoritmos

import kotlin.math.*

fun main() {
    println("Testando hierarquia no UAL")
    val divisor = 6 % 2
    println("18 / (6 % 2) = " + (18.0 / divisor))
    println("(20 / 4) div 2 = " + (round(20 / 4.0).toInt() / 2))
    println("(30 / 4) div 2 = " + (round(30 / 4.0).toInt() / 2))
    for (valor in 7 downTo 6) {
        println("$valor.0 div 4 no UAL: " + round(valor / 4.0).toInt())
        println("$valor div 4: " + valor / 4)
    }
}
