package algoritmos

fun main() {
    println("Data no formato ddmmaa:")
    val entrada = readln()
    val data = entrada.trim()
    if (data.length != 6 || !data.all { it in '0'..'9' }) {
        println("Formato inválido.")
        return
    }
    println("Dia: " + data.take(2))
    println("Mês: " + data.substring(2, 4))
    println("Ano: " + data.takeLast(2))
}
