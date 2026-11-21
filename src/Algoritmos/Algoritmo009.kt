package algoritmos

fun main() {
    val tabuleiro = CharArray(9) { ' ' }
    val linhas = arrayOf(
        intArrayOf(0, 1, 2), intArrayOf(3, 4, 5), intArrayOf(6, 7, 8),
        intArrayOf(0, 3, 6), intArrayOf(1, 4, 7), intArrayOf(2, 5, 8),
        intArrayOf(0, 4, 8), intArrayOf(2, 4, 6)
    )
    fun mostrar() {
        for (inicio in 0..6 step 3) {
            println((inicio..inicio + 2).joinToString(" | ") {
                if (tabuleiro[it] == ' ') (it + 1).toString() else tabuleiro[it].toString()
            })
        }
    }
    fun ganhou(marca: Char) = linhas.any { linha -> linha.all { tabuleiro[it] == marca } }
    while (' ' in tabuleiro) {
        mostrar()
        println("Escolha uma casa livre de 1 a 9:")
        val casa = readln().trim().toIntOrNull() ?: continue
        if (casa !in 1..9 || tabuleiro[casa - 1] != ' ') continue
        tabuleiro[casa - 1] = 'X'
        if (ganhou('X') || ' ' !in tabuleiro) break
        val bloqueio = linhas.firstOrNull { linha ->
            linha.count { tabuleiro[it] == 'X' } == 2 && linha.any { tabuleiro[it] == ' ' }
        }
        val jogada = when {
            tabuleiro[4] == ' ' -> 4
            bloqueio != null -> bloqueio.first { tabuleiro[it] == ' ' }
            else -> listOf(0, 2, 6, 8, 1, 3, 5, 7).first { tabuleiro[it] == ' ' }
        }
        tabuleiro[jogada] = 'O'
        if (ganhou('O')) break
    }
    mostrar()
    println(when {
        ganhou('X') -> "Você venceu."
        ganhou('O') -> "O computador venceu."
        else -> "Empate."
    })
}
