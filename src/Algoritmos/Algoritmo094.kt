package algoritmos

fun main() {
    println("Número inteiro:")
    val numero = readln().trim().toInt()
    println(if (numero % 3 == 0) "É múltiplo de 3." else "Não é múltiplo de 3.")
}
