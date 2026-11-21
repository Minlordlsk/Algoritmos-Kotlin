package algoritmos

fun main() {
    println("Nome do aluno:")
    val nome = readln()
    println("Nota da PR1:")
    val pr1 = readln().trim().replace(',', '.').toDouble()
    println("Nota da PR2:")
    val pr2 = readln().trim().replace(',', '.').toDouble()
    val media = (pr1 + pr2) / 2
    println("Nome: $nome")
    println("PR1: $pr1")
    println("PR2: $pr2")
    println("Média: $media")
    println(when {
        media >= 7 -> "Aprovado"
        media < 3 -> "Reprovado"
        else -> "Em Prova Final"
    })
}
