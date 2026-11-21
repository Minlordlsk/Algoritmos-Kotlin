package algoritmos

fun main() {
    println("Número:")
    val numero = readln().trim().replace(',', '.').toDouble()
    println(if (numero > 20 && numero < 90) "Está entre 20 e 90." else "Está fora do intervalo aberto de 20 a 90.")
}
