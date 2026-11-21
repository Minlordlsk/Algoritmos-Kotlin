package algoritmos

import kotlin.math.*

fun main() {
    println("Primeiro número:")
    val a = readln().trim().replace(',', '.').toDouble()
    println("Segundo número:")
    val b = readln().trim().replace(',', '.').toDouble()
    val menor = minOf(a, b)
    val maior = maxOf(a, b)
    println("Quadrado do menor: " + menor * menor)
    println(if (maior >= 0) "Raiz quadrada do maior: " + sqrt(maior) else "O maior não tem raiz quadrada real.")
}
