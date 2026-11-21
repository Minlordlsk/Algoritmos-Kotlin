package algoritmos

fun main() {
    println("Salário bruto:")
    val salario = readln().trim().replace(',', '.').toDouble()
    println("Valor da prestação:")
    val prestacao = readln().trim().replace(',', '.').toDouble()
    println(if (prestacao <= salario * 0.3) "Empréstimo pode ser concedido." else "Empréstimo não pode ser concedido.")
}
