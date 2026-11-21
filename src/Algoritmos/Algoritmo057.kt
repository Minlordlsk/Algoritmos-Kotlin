package algoritmos

import kotlin.math.*

fun main() {
    println("Nota da PR1:")
    val pr1 = readln().trim().replace(',', '.').toDouble()
    println("Nota da PR2:")
    val pr2 = readln().trim().replace(',', '.').toDouble()
    val media = (pr1 + pr2) / 2
    println("Média truncada: " + media.toInt())
    println("Média arredondada: " + floor(media + 0.5).toInt())
}
