package algoritmos

fun main() {
    println("ACIMA DA DIAGONAL PRINCIPAL")
    for (linha in 1..9) {
        repeat(linha) { print("\t") }
        for (coluna in linha + 1..10) print("$linha-$coluna\t")
        println()
    }
}
