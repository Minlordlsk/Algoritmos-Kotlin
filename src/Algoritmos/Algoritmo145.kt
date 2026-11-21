package algoritmos

fun main() {
    println("Nome do livro:")
    val livro = readln()
    println("Tipo de usuário (professor/aluno):")
    val usuario = readln()
    val dias = when (usuario.trim().lowercase()) {
        "professor", "p" -> 10
        "aluno", "a" -> 3
        else -> {
            println("Tipo de usuário inválido.")
            return
        }
    }
    println("Nome do livro: $livro")
    println("Tipo de usuário: " + if (dias == 10) "professor" else "aluno")
    println("Total de dias: $dias")
}
