package algoritmos

fun main() {
    println("Palavra em minúsculas:")
    val palavra = readln()
    val meio = palavra.length / 2
    when {
        palavra.isEmpty() -> println("Palavra vazia.")
        palavra.length % 2 == 1 -> println(if (palavra[meio] in "aeiouáéíóúâêôãõà") "É vogal." else "Não é vogal.")
        else -> {
            val centro = palavra.substring(meio - 1, meio + 1)
            println(if (centro == "rr" || centro == "ss") "É rr ou ss." else "Não é rr nem ss.")
        }
    }
}
