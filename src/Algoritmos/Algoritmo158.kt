package algoritmos

fun main() {
    println("Valor de x:")
    val x = readln().trim().replace(',', '.').toDouble()
    println(if (x == 2.0) "f(x) não é definida para este valor." else "f(x) = " + 8 / (2 - x))
}
