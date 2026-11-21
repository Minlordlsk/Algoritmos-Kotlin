package algoritmos

fun main() {
    println("Número inteiro:")
    val numero = readln().trim().toInt()
    println(if (numero % 2 == 0) "PAR" else "ÍMPAR")
}
