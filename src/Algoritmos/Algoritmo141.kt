package algoritmos

fun main() {
    println("Nome do primeiro finalista:")
    val primeiro = readln()
    println("Pontos do primeiro finalista:")
    val pontos1 = readln().trim().toInt()
    println("Nome do segundo finalista:")
    val segundo = readln()
    println("Pontos do segundo finalista:")
    val pontos2 = readln().trim().toInt()
    println("Nome do terceiro finalista:")
    val terceiro = readln()
    println("Pontos do terceiro finalista:")
    val pontos3 = readln().trim().toInt()
    val colocacoes = listOf(primeiro to pontos1, segundo to pontos2, terceiro to pontos3).sortedByDescending { it.second }
    val etiquetas = listOf("Vencedor", "Segundo colocado", "Terceiro colocado")
    for (indice in colocacoes.indices) {
        val (nome, pontos) = colocacoes[indice]
        println(etiquetas[indice] + ": $nome - $pontos pontos")
    }
}
