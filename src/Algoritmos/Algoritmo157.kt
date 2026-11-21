package algoritmos

fun main() {
    println("Data no formato ddmmaaaa:")
    val entrada = readln()
    val data = entrada.trim()
    if (data.length != 8 || !data.all { it in '0'..'9' }) {
        println("Data inválida.")
        return
    }
    val dia = data.substring(0, 2).toInt()
    val mes = data.substring(2, 4).toInt()
    val ano = data.substring(4).toInt()
    val bissexto = ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0
    val limite = when (mes) {
        2 -> if (bissexto) 29 else 28
        4, 6, 9, 11 -> 30
        1, 3, 5, 7, 8, 10, 12 -> 31
        else -> 0
    }
    println(if (ano > 0 && dia in 1..limite) "Data válida." else "Data inválida.")
}
