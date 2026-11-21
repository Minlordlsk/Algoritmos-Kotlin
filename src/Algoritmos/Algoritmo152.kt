package algoritmos

fun main() {
    println("Simulação do exercício com a tabela hipotética do livro.")
    println("Peso em kg:")
    val peso = readln().trim().replace(',', '.').toDouble()
    println("Idade em anos:")
    val idade = readln().trim().toInt()
    val miligramas = when {
        peso < 5 || idade < 0 -> 0
        idade >= 12 && peso >= 60 -> 1000
        idade >= 12 -> 875
        peso <= 9 -> 125
        peso <= 16 -> 250
        peso <= 24 -> 375
        peso <= 30 -> 500
        else -> 750
    }
    println(if (miligramas == 0) "A tabela não prevê uma dose." else "Resultado do exercício: " + miligramas / 25 + " gotas por dose.")
}
