package algoritmos

fun main() {
    println("ACIMA DA DIAGONAL SECUNDÁRIA")
    for (linha in 1..9) {
        for (coluna in 1..10 - linha) print("$linha-$coluna\t")
        println()
    }
}
