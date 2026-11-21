package algoritmos

fun main() {
    println("Número entre 0 e 60:")
    val numero = readln().trim().toInt()
    println("Sucessor: " + (numero + 1) % 61)
}
