package algoritmos

fun main() {
    println("Data no formato ddmmaa:")
    val entrada = readln()
    val data = entrada.trim()
    if (data.length != 6 || !data.all { it in '0'..'9' }) {
        println("Formato inválido.")
        return
    }
    val dia = data.take(2)
    val mes = data.substring(2, 4)
    val ano = data.takeLast(2)
    println("Dia: $dia")
    println("Mês: $mes")
    println("Ano: $ano")
    println("Data no formato mmddaa: $mes$dia$ano")
}
