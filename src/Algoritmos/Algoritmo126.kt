package algoritmos

fun main() {
    println("Número:")
    val numero = readln().trim().replace(',', '.').toDouble()
    println(when (numero) {
        5.0, 200.0, 400.0 -> "O número é " + numero.toInt()
        in 500.0..1000.0 -> "Está entre 500 e 1000, inclusive."
        else -> "Está fora dos valores e intervalos solicitados."
    })
}
