package algoritmos

import kotlin.math.*

fun main() {
    println("Lado:")
    val lado = readln().trim().replace(',', '.').toDouble()
    println("Perímetro: " + 4 * lado)
    println("Área: " + lado * lado)
    println("Diagonal: " + lado * sqrt(2.0))
}
