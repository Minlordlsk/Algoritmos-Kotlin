package algoritmos

fun main() {
    println("Base:")
    val base = readln().trim().replace(',', '.').toDouble()
    println("Altura:")
    val altura = readln().trim().replace(',', '.').toDouble()
    println("Área: " + base * altura / 2)
}
