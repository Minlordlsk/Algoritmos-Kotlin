package algoritmos

fun main() {
    println("Idade:")
    val idade = readln().trim().toInt()
    println(if (idade >= 18) "Maior de idade." else "Menor de idade.")
    if (idade > 65) println("Maior de 65 anos.")
}
