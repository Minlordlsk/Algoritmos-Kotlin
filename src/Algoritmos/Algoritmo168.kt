package algoritmos

fun main() {
    println("DIAGONAL PRINCIPAL")
    for (linha in 1..10) {
        repeat(linha - 1) { print("\t") }
        println("$linha-$linha")
    }
}
