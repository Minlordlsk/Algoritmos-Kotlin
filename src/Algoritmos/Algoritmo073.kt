package algoritmos

import kotlin.math.*

fun main() {
    println("Número real:")
    val numero = readln().trim().replace(',', '.').toDouble()
    val inteira = numero.toLong()
    println("Parte inteira: $inteira")
    println("Parte fracionária: %.3f".format(numero - inteira))
    println("Número arredondado: " + floor(numero + 0.5).toLong())
}
