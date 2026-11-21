package algoritmos

fun main() {
    println("Destino (1 Norte, 2 Nordeste, 3 Centro-Oeste, 4 Sul):")
    val destino = readln().trim().toInt()
    println("Inclui volta (s/n):")
    val volta = readln()
    val ida = listOf(500, 350, 350, 300)
    val idaEVolta = listOf(900, 650, 600, 550)
    if (destino in 1..4) {
        val preco = if (volta.trim().equals("s", true)) idaEVolta[destino - 1] else ida[destino - 1]
        println("Passagem: R$ %.2f".format(preco.toDouble()))
    } else println("Destino inválido.")
}
