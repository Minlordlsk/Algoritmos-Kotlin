package algoritmos

fun main() {
    println("Número inteiro:")
    val numero = readln().trim().toInt()
    println(if (numero % 3 == 0 && numero % 7 == 0) "É divisível por 3 e por 7." else "Não é divisível por 3 e por 7 ao mesmo tempo.")
}
