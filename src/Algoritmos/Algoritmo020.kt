package algoritmos

fun main() {
    println("Primeira palavra:")
    val primeira = readln()
    println("Segunda palavra:")
    val segunda = readln()
    println("Tamanho: " + primeira.length)
    println("Concatenando: " + (primeira + segunda))
    val copia = primeira
    val uniao = primeira + segunda
    println("Cópia: $copia")
    println("Concatenação armazenada: $uniao")
    println("Primeiro caractere: " + primeira.take(1))
    println("Último caractere: " + primeira.takeLast(1))
    println("Todos menos o primeiro: " + primeira.drop(1))
    println("Quarto caractere: " + (primeira.getOrNull(3) ?: ""))
    println("Três primeiros: " + primeira.take(3))
    println("Três últimos: " + primeira.takeLast(3))
}
