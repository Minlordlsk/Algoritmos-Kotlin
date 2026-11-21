package algoritmos

fun main() {
    println("Diagonal maior:")
    val maior = readln().trim().replace(',', '.').toDouble()
    println("Diagonal menor:")
    val menor = readln().trim().replace(',', '.').toDouble()
    println("Área: " + maior * menor / 2)
}
