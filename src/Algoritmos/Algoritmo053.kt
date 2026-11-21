package algoritmos

import kotlin.math.*

fun main() {
    println("Aresta a:")
    val a = readln().trim().replace(',', '.').toDouble()
    println("Aresta b:")
    val b = readln().trim().replace(',', '.').toDouble()
    println("Aresta c:")
    val c = readln().trim().replace(',', '.').toDouble()
    println("Diagonal: " + sqrt(a * a + b * b + c * c))
}
