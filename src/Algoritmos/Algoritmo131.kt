package algoritmos

fun main() {
    println("Nome do aluno:")
    val nome = readln()
    val sala = when (nome.trim().uppercase().firstOrNull()) {
        in 'A'..'K' -> 101
        in 'L'..'N' -> 102
        in 'O'..'Z' -> 103
        else -> 0
    }
    println(if (sala == 0) "Nome inválido." else "$nome: bloco F, sala $sala.")
}
