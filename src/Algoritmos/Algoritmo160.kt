package algoritmos

fun main() {
    println("Valor de x:")
    val x = readln().trim().replace(',', '.').toDouble()
    val y = when {
        x <= 1 -> 1.0
        x <= 2 -> 2.0
        x <= 3 -> x * x
        else -> x * x * x
    }
    println("f(x) = $y")
}
