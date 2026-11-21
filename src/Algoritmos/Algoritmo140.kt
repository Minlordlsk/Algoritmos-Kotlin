package algoritmos

fun main() {
    println("Primeiro nome do cliente:")
    val nome = readln()
    println("Valor da conta:")
    val conta = readln().trim().replace(',', '.').toDouble()
    if (nome.trim().uppercase().firstOrNull() in listOf('A', 'O', 'M', 'S')) {
        println("Total com 30%% de desconto: R$ %.2f".format(conta * 0.7))
    } else {
        println("Que pena. Nesta semana o desconto não é para seu nome; mas continue nos prestigiando que sua vez chegará.")
        println("Total: R$ %.2f".format(conta))
    }
}
