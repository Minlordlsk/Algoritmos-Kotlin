package algoritmos

fun main() {
    println("Nome:")
    val nome = readln()
    println("Todo o nome: $nome")
    println("Primeiro caractere: " + nome.take(1))
    println("Último caractere: " + nome.takeLast(1))
    println("Até o terceiro: " + nome.take(3))
    println("Quarto caractere: " + (nome.getOrNull(3) ?: ""))
    println("Todos menos o primeiro: " + nome.drop(1))
    println("Dois últimos: " + nome.takeLast(2))
}
