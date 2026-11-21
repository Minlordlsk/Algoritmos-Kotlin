package algoritmos

fun main() {
    println("Número:")
    val numero = readln().trim().replace(',', '.').toDouble()
    if (numero > 20) println(numero)
}
