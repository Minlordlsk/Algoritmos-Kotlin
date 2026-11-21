package algoritmos

fun main() {
    println("Primeiro número:")
    val a = readln().trim().replace(',', '.').toDouble()
    println("Segundo número:")
    val b = readln().trim().replace(',', '.').toDouble()
    println("Terceiro número:")
    val c = readln().trim().replace(',', '.').toDouble()
    println(when {
        a > b && a > c -> a
        b > c -> b
        else -> c
    })
}
