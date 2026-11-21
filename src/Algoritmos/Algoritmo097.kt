package algoritmos

fun main() {
    println("Número inteiro:")
    val numero = readln().trim().toInt()
    println(when {
        numero % 10 == 0 -> "Divisível por 10."
        numero % 5 == 0 -> "Divisível por 5."
        numero % 2 == 0 -> "Divisível por 2."
        else -> "Não é divisível por 10, 5 ou 2."
    })
}
