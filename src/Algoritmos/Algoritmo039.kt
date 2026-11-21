package algoritmos

fun main() {
    println("Primeiro número real:")
    val a = readln().trim().replace(',', '.').toDouble()
    println("Segundo número real:")
    val b = readln().trim().replace(',', '.').toDouble()
    println("Média: " + (a + b) / 2)
}
