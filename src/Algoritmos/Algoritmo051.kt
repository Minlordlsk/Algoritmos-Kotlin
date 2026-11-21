package algoritmos

import kotlin.math.*

fun main() {
    println("Raio:")
    val raio = readln().trim().replace(',', '.').toDouble()
    println("Perímetro: " + 2 * PI * raio)
    println("Área: " + PI * raio * raio)
}
