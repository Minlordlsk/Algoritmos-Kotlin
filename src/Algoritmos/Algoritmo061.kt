package algoritmos

fun main() {
    println("Primeiro termo da PG:")
    val primeiro = readln().trim().toInt()
    println("Razão da PG:")
    val razao = readln().trim().toInt()
    println("Quinto termo: " + primeiro.toLong() * razao * razao * razao * razao)
}
