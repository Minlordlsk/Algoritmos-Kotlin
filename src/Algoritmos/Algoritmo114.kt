package algoritmos

fun main() {
    println("Primeiro número:")
    val a = readln().trim().replace(',', '.').toDouble()
    println("Segundo número:")
    val b = readln().trim().replace(',', '.').toDouble()
    if (a > b) {
        println(a)
        println(b)
    } else {
        println(b)
        println(a)
    }
}
