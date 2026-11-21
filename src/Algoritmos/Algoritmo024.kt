package algoritmos

fun main() {
    println("Número de três algarismos:")
    val numero = readln().trim().toInt()
    println("Dezenas: " + ((numero / 10) % 10))
}
