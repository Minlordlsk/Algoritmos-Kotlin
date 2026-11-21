package algoritmos

import kotlin.math.*

fun main() {
    println("Valor da aplicação mensal:")
    val mensal = readln().trim().replace(',', '.').toDouble()
    println("Taxa mensal de 0 a 1:")
    val taxa = readln().trim().replace(',', '.').toDouble()
    println("Número de meses:")
    val meses = readln().trim().toInt()
    val acumulado = if (taxa == 0.0) mensal * meses else mensal * ((1 + taxa).pow(meses) - 1) / taxa
    println("Valor acumulado: R$ %.2f".format(acumulado))
}
