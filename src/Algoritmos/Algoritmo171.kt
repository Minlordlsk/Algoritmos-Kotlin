package algoritmos

fun main() {
    println("DIAGONAL SECUNDÁRIA")
    for (linha in 1..10) {
        repeat(10 - linha) { print("\t") }
        val coluna = 11 - linha
        println("$linha-$coluna")
    }
}
