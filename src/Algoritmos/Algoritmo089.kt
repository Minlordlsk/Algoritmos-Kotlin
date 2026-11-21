package algoritmos

fun main() {
    println("1 Mercúrio, 2 Vênus, 3 Marte, 4 Júpiter, 5 Saturno, 6 Urano:")
    val opcao = readln().trim().toInt()
    println("Peso na Terra:")
    val peso = readln().trim().replace(',', '.').toDouble()
    val fatores = listOf(0.37, 0.88, 0.38, 2.64, 1.15, 1.17)
    println(if (opcao in 1..6) "Peso no planeta escolhido: " + peso / 10 * fatores[opcao - 1] else "Planeta inválido.")
}
