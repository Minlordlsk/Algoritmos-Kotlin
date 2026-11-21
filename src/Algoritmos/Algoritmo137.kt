package algoritmos

import kotlin.math.*

fun main() {
    println("Coeficiente a:")
    val a = readln().trim().toInt()
    println("Coeficiente b:")
    val b = readln().trim().toInt()
    println("Coeficiente c:")
    val c = readln().trim().toInt()
    val delta = b.toDouble() * b - 4.0 * a * c
    when {
        a == 0 -> println("Não é equação do segundo grau.")
        delta < 0 -> println("Não há raízes reais.")
        else -> {
            val raiz = sqrt(delta)
            println("x1 = " + (-b.toDouble() + raiz) / (2.0 * a))
            println("x2 = " + (-b.toDouble() - raiz) / (2.0 * a))
        }
    }
}
