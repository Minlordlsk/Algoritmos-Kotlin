package algoritmos

fun main() {
    println("Número de quatro algarismos:")
    val numero = readln().trim().toInt()
    println(if (numero / 100 % 4 == 0) "É múltiplo de 4." else "Não é múltiplo de 4.")
}
