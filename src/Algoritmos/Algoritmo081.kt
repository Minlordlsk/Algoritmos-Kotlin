package algoritmos

fun main() {
    println("Conta corrente com três dígitos:")
    val conta = readln().trim().toInt()
    val inverso = conta % 10 * 100 + conta / 10 % 10 * 10 + conta / 100
    val soma = conta + inverso
    val peso = soma / 100 + 2 * (soma / 10 % 10) + 3 * (soma % 10)
    println("Dígito verificador: " + peso % 10)
}
