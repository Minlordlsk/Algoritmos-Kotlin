package algoritmos

fun main() {
    println("Salário mínimo:")
    val salario = readln().trim().replace(',', '.').toDouble()
    println("Quilowatts consumidos:")
    val consumo = readln().trim().replace(',', '.').toDouble()
    val unitario = salario / 700
    val total = consumo * unitario
    println("Valor por quilowatt: R$ %.2f".format(unitario))
    println("Valor a pagar: R$ %.2f".format(total))
    println("Com desconto de 10%%: R$ %.2f".format(total * 0.9))
}
