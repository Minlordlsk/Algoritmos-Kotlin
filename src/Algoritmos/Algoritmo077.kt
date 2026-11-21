package algoritmos

fun main() {
    println("Primeiro número real:")
    val a = readln().trim().replace(',', '.').toDouble()
    println("Segundo número real:")
    val b = readln().trim().replace(',', '.').toDouble()
    val diferenca = a - b
    println("Quadrado da diferença: " + diferenca * diferenca)
    println("Diferença dos quadrados: " + (a * a - b * b))
}
