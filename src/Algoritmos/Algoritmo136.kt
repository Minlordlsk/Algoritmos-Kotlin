package algoritmos

fun main() {
    println("Nome:")
    val nome = readln()
    println("Idade:")
    val idade = readln().trim().toInt()
    val mensalidade = when {
        idade <= 10 -> 30.0
        idade <= 29 -> 60.0
        idade <= 45 -> 120.0
        idade <= 59 -> 150.0
        idade <= 65 -> 250.0
        else -> 400.0
    }
    println("$nome: R$ %.2f".format(mensalidade))
}
