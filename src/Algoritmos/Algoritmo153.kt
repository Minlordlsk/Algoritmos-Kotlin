package algoritmos

fun main() {
    println("Índice de poluição:")
    val indice = readln().trim().replace(',', '.').toDouble()
    println(when {
        indice >= 0.5 -> "Intimar os grupos 1, 2 e 3 a suspender as atividades."
        indice >= 0.4 -> "Intimar os grupos 1 e 2 a suspender as atividades."
        indice >= 0.3 -> "Intimar o grupo 1 a suspender as atividades."
        indice <= 0.25 -> "Índice de poluição aceitável."
        else -> "Índice acima do aceitável, sem intimação prevista na tabela."
    })
}
