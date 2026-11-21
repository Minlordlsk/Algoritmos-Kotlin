package algoritmos

fun main() {
    println("Valor do salário mínimo:")
    val minimo = readln().trim().replace(',', '.').toDouble()
    println("Salário da pessoa:")
    val salario = readln().trim().replace(',', '.').toDouble()
    println(if (minimo > 0) "Quantidade de salários mínimos: " + salario / minimo else "Salário mínimo inválido.")
}
