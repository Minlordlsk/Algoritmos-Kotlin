package algoritmos

fun main() {
    println("Primeiro número:")
    val a = readln().trim().replace(',', '.').toDouble()
    println("Segundo número:")
    val b = readln().trim().replace(',', '.').toDouble()
    println("Terceiro número:")
    val c = readln().trim().replace(',', '.').toDouble()
    val (menor, intermediario, maior) = listOf(a, b, c).sorted()
    println("Maior: $maior")
    println("Intermediário: $intermediario")
    println("Menor: $menor")
}
