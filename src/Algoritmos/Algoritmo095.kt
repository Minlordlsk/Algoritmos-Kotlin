package algoritmos

fun main() {
    println("Número inteiro:")
    val numero = readln().trim().toInt()
    println(if (numero % 5 == 0) "É divisível por 5." else "Não é divisível por 5.")
}
