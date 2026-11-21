package algoritmos

fun main() {
    println("Salário:")
    val salario = readln().trim().replace(',', '.').toDouble()
    val taxa = when {
        salario <= 600 -> 0.0
        salario <= 1200 -> 0.20
        salario <= 2000 -> 0.25
        else -> 0.30
    }
    println(if (taxa == 0.0) "Isento." else "Desconto do INSS: R$ %.2f".format(salario * taxa))
}
