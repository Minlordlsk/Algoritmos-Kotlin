package algoritmos

fun main() {
    println("Primeiro termo da PA:")
    val primeiro = readln().trim().toInt()
    println("Razão da PA:")
    val razao = readln().trim().toInt()
    println("Décimo termo: " + (primeiro + 9 * razao))
}
