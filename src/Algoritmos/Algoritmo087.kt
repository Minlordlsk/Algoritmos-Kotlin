package algoritmos

fun main() {
    println("Qual é a capital do Brasil?:")
    val resposta = readln().trim()
    println(when {
        resposta == "Brasília" || resposta == "BRASÍLIA" -> "PARABÉNS!"
        resposta.lowercase() in listOf("brasília", "brasilia", "brazília", "brazilia") ->
            "CERTO! Mas atenção para a grafia: Brasília ou BRASÍLIA."
        else -> "ERRADO! ESTUDE MAIS!"
    })
}
