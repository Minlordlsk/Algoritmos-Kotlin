package algoritmos

fun main() {
    println("Valor da hora-aula:")
    val hora = readln().trim().replace(',', '.').toDouble()
    println("Aulas dadas no mês:")
    val aulas = readln().trim().toInt()
    println("Percentual de desconto do INSS:")
    val desconto = readln().trim().replace(',', '.').toDouble()
    val bruto = hora * aulas
    println("Salário líquido: R$ %.2f".format(bruto * (1 - desconto / 100)))
}
