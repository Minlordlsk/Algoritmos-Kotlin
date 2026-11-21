package algoritmos

fun main() {
    println("Operação (+, -, *, /):")
    val operador = readln()
    if (operador !in listOf("+", "-", "*", "/")) {
        println("Operação inválida.")
        return
    }
    println("Primeiro número:")
    val a = readln().trim().replace(',', '.').toDouble()
    println("Segundo número:")
    val b = readln().trim().replace(',', '.').toDouble()
    println(when (operador) {
        "+" -> "Soma: " + (a + b)
        "-" -> "Subtração: " + (a - b)
        "*" -> "Multiplicação: " + a * b
        else -> if (b == 0.0) "Divisão por zero." else "Divisão: " + a / b
    })
}
