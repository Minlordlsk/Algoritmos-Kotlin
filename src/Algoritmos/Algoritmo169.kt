package algoritmos

fun main() {
    println("ABAIXO DA DIAGONAL PRINCIPAL")
    for (linha in 2..10) {
        for (coluna in 1 until linha) print("$linha-$coluna\t")
        println()
    }
}
