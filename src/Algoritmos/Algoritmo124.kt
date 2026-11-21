package algoritmos

import kotlin.math.*

fun main() {
    println("Primeiro lado:")
    val a = readln().trim().replace(',', '.').toDouble()
    println("Segundo lado:")
    val b = readln().trim().replace(',', '.').toDouble()
    println("Terceiro lado:")
    val c = readln().trim().replace(',', '.').toDouble()
    val (menor, medio, maior) = listOf(a, b, c).sorted()
    val quadrado = maior * maior
    val soma = menor * menor + medio * medio
    println(when {
        menor <= 0 || menor + medio <= maior -> "Não formam um triângulo."
        abs(quadrado - soma) <= quadrado * 1e-12 -> "Retângulo"
        quadrado < soma -> "Acutângulo"
        else -> "Obtusângulo"
    })
}
