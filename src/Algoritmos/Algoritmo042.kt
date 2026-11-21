package algoritmos

import kotlin.math.*

fun main() {
    println("Ângulo em graus:")
    val graus = readln().trim().replace(',', '.').toDouble()
    val angulo = graus * PI / 180
    val seno = sin(angulo)
    val cosseno = cos(angulo)
    println("Seno: $seno")
    println("Cosseno: $cosseno")
    println("Tangente: " + if (abs(cosseno) < 1e-12) "indefinida" else seno / cosseno)
    println("Secante: " + if (abs(cosseno) < 1e-12) "indefinida" else 1 / cosseno)
    println("Cossecante: " + if (abs(seno) < 1e-12) "indefinida" else 1 / seno)
    println("Cotangente: " + if (abs(seno) < 1e-12) "indefinida" else cosseno / seno)
}
