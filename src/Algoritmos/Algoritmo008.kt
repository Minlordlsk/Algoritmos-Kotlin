package algoritmos

fun main() {
    println("Palavra secreta:")
    val entrada = readln()
    val palavra = entrada.trim().lowercase()
    val lacunas = CharArray(palavra.length) { if (palavra[it].isLetter()) '_' else palavra[it] }
    val partes = listOf("cabeça", "tronco", "braço esquerdo", "braço direito", "perna esquerda", "perna direita")
    var erros = 0
    while ('_' in lacunas && erros < partes.size) {
        println(lacunas.joinToString(" "))
        println("Digite uma letra:")
        val letra = readln().trim().lowercase().singleOrNull() ?: continue
        if (letra in palavra) {
            for (posicao in palavra.indices) {
                if (palavra[posicao] == letra) lacunas[posicao] = letra
            }
        } else {
            println("Desenhe: " + partes[erros])
            erros++
        }
    }
    println(if ('_' !in lacunas) "Você acertou: $palavra" else "Fim de jogo. Palavra: $palavra")
}
