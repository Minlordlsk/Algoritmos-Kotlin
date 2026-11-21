package algoritmos

fun main() {
    println("Numerador:")
    val numerador = readln().trim().toInt()
    println("Denominador:")
    val denominador = readln().trim().toInt()
    println(if (denominador == 0) "Denominador inválido." else numerador.toDouble() / denominador)
}
