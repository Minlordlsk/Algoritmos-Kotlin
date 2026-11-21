package algoritmos

import kotlin.math.*

fun main() {
    println("Base:")
    val base = readln().trim().replace(',', '.').toDouble()
    println("Altura:")
    val altura = readln().trim().replace(',', '.').toDouble()
    println("Perímetro: " + 2 * (base + altura))
    println("Área: " + base * altura)
    println("Diagonal: " + hypot(base, altura))
}
