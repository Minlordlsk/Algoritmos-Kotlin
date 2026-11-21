package algoritmos

fun main() {
    println("Número de lados:")
    val lados = readln().trim().toInt()
    println("Diagonais: " + lados.toLong() * (lados - 3) / 2)
}
