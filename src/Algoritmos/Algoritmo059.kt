package algoritmos

import kotlin.math.*

fun main() {
    println("Primeiro cateto:")
    val a = readln().trim().replace(',', '.').toDouble()
    println("Segundo cateto:")
    val b = readln().trim().replace(',', '.').toDouble()
    println("Hipotenusa: " + hypot(a, b))
}
