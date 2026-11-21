package algoritmos

fun main() {
    println("Primeiro número:")
    val a = readln().trim().replace(',', '.').toDouble()
    println("Segundo número:")
    val b = readln().trim().replace(',', '.').toDouble()
    println("Terceiro número:")
    val c = readln().trim().replace(',', '.').toDouble()
    println("Quarto número:")
    val d = readln().trim().replace(',', '.').toDouble()
    println("Média ponderada: " + (a + 2 * b + 3 * c + 4 * d) / 10)
}
