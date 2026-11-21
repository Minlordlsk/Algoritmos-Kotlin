package algoritmos

fun main() {
    println("Prato (1 Vegetariano, 2 Peixe, 3 Frango, 4 Carne):")
    val prato = readln().trim().toInt()
    println("Sobremesa (1 Abacaxi, 2 Sorvete diet, 3 Mousse diet, 4 Mousse de chocolate):")
    val sobremesa = readln().trim().toInt()
    println("Bebida (1 Chá, 2 Suco de laranja, 3 Suco de melão, 4 Refrigerante diet):")
    val bebida = readln().trim().toInt()
    val pratos = listOf(180, 230, 250, 350)
    val sobremesas = listOf(75, 110, 170, 200)
    val bebidas = listOf(20, 70, 100, 65)
    if (prato in 1..4 && sobremesa in 1..4 && bebida in 1..4) {
        val total = pratos[prato - 1] + sobremesas[sobremesa - 1] + bebidas[bebida - 1]
        println("Total: $total calorias.")
    } else println("Opção inválida.")
}
