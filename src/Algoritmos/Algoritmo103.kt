package algoritmos

fun main() {
    println("Ano atual:")
    val atual = readln().trim().toInt()
    println("Ano de nascimento:")
    val nascimento = readln().trim().toInt()
    println(if (nascimento in 1..atual) "Idade: " + (atual - nascimento) else "Ano de nascimento inválido.")
}
