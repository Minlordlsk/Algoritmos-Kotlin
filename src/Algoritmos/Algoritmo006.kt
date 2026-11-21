package algoritmos

fun main() {
    println("Pegue faca, bacia e batatas. Coloque água na bacia.")
    println("Quantidade de batatas:")
    val quantidade = readln().trim().toInt()
    for (batata in 1..quantidade) println("Descasque a batata $batata.")
}
