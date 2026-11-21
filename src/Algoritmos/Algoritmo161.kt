package algoritmos

fun main() {
    for (indice in 1..5) {
        println("Número $indice:")
        val numero = readln().trim().replace(',', '.').toDouble()
        println("Quadrado: " + numero * numero)
    }
}
