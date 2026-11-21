package algoritmos

fun main() {
    println("Altura da lata:")
    val altura = readln().trim().replace(',', '.').toDouble()
    println("Raio da lata:")
    val raio = readln().trim().replace(',', '.').toDouble()
    println("Volume: " + 3.14159 * raio * raio * altura)
}
