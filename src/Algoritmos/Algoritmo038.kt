package algoritmos

fun main() {
    println("Número real:")
    val numero = readln().trim().replace(',', '.').toDouble()
    println("Terça parte: " + numero / 3)
}
