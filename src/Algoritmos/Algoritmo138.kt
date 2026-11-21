package algoritmos

fun main() {
    println("Número de 1 a 12:")
    val numero = readln().trim().toInt()
    val meses = listOf("janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro")
    println(if (numero in 1..12) meses[numero - 1] else "Não existe mês com este número.")
}
