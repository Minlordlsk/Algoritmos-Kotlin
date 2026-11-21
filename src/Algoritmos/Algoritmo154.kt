package algoritmos

fun main() {
    println("Placa do carro:")
    val placa = readln()
    val meses = listOf("outubro", "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro")
    val digito = placa.trim().lastOrNull()?.digitToIntOrNull()
    println(if (digito == null) "Placa inválida." else "Mês de renovação: " + meses[digito])
}
