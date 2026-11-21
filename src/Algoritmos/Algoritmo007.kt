package algoritmos

fun main() {
    println("Leia a prova e pegue a caneta.")
    println("Número de questões:")
    val total = readln().trim().toInt()
    val resolvidas = BooleanArray(total)
    var faltam = total
    var questao = 0
    while (faltam > 0) {
        if (!resolvidas[questao]) {
            println("Questão " + (questao + 1) + ": sabe resolver? (s/n/tempo)")
            val resposta = readln().trim().lowercase()
            if (resposta == "tempo") break
            if (resposta == "s") {
                println("Resolva a questão.")
                resolvidas[questao] = true
                faltam--
            } else println("Passe para a próxima questão.")
        }
        questao = (questao + 1) % total
    }
    println("Entregue a prova.")
}
