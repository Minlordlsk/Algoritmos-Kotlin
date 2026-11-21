package algoritmos

fun main() {
    println("Dia:")
    val dia = readln().trim().toInt()
    println("Mês:")
    val mes = readln().trim().toInt()
    println("Ano:")
    val ano = readln().trim().toInt()
    val bissexto = ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0
    val limite = when (mes) {
        2 -> if (bissexto) 29 else 28
        4, 6, 9, 11 -> 30
        1, 3, 5, 7, 8, 10, 12 -> 31
        else -> 0
    }
    println(if (ano > 0 && dia in 1..limite) "Data válida." else "Data inválida.")
}
