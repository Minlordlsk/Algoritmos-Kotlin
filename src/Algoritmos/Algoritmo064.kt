package algoritmos

fun main() {
    println("Temperatura em graus Celsius:")
    val celsius = readln().trim().replace(',', '.').toDouble()
    println("Temperatura em Fahrenheit: " + (9 * celsius + 160) / 5)
}
