package algoritmos

fun main() {
    println("ABAIXO DA DIAGONAL SECUNDÁRIA")
    for (linha in 2..10) {
        repeat(11 - linha) { print("\t") }
        for (coluna in 12 - linha..10) print("$linha-$coluna\t")
        println()
    }
}
