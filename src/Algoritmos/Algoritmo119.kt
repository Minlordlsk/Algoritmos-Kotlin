package algoritmos

fun main() {
    println("Primeiro número:")
    val a = readln().trim().replace(',', '.').toDouble()
    println("Segundo número:")
    val b = readln().trim().replace(',', '.').toDouble()
    println("Terceiro número:")
    val c = readln().trim().replace(',', '.').toDouble()
    for (numero in listOf(a, b, c).sortedDescending()) println(numero)
}
