package algoritmos

fun main() {
    println("Palavra:")
    val palavra = readln()
    val inicial = palavra.firstOrNull()?.uppercaseChar()
    val nova = if (inicial == 'L' || inicial == 'D') palavra.take(2) + palavra.takeLast(1) else palavra.drop(1)
    println(nova)
}
