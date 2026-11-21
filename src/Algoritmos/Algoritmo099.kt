package algoritmos

fun main() {
    println("Número de três algarismos:")
    val numero = readln().trim().toInt()
    val centena = numero / 100
    println(if (centena % 2 == 0) "Centena par." else "Centena ímpar.")
}
