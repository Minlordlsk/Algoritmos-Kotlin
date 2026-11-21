package algoritmos

fun main() {
    println("Primeiro número:")
    val a = readln().trim().replace(',', '.').toDouble()
    println("Segundo número:")
    val b = readln().trim().replace(',', '.').toDouble()
    println("Terceiro número:")
    val c = readln().trim().replace(',', '.').toDouble()
    var maior = a
    if (b > maior) maior = b
    if (c > maior) maior = c
    println(maior)
}
