package algoritmos

import kotlin.math.*

fun main() {
    println("Raiz: " + sqrt(64.0))
    val raiz = exp(ln(64.0) / 2)
    println("Raiz com exp e log e arredondamento: " + round(raiz).toInt())
    println("Raiz com exp e log: $raiz")
    println("Seno de 45 graus: %.3f".format(sin(PI / 4)))
    val potencia = exp(3 * ln(8.0))
    println("Potência com exp e log: $potencia")
    println("Potência formatada: %.3f".format(potencia))
    println("Potência com pow: %.3f".format(8.0.pow(3)))
    println("Raiz cúbica: " + exp(ln(8.0) / 3))
    for (numero in listOf(-8, 8)) println("Absoluto de $numero: " + abs(numero))
    for (numero in listOf(5.5, 6.5, 6.5 + 0.0001, 5.45, 5.51, 3.0 / 4)) {
        println("$numero convertido para inteiro: " + round(numero).toInt())
    }
    println("87 convertido para real: " + 87.toDouble())
}
