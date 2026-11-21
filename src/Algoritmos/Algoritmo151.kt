package algoritmos

fun main() {
    println("Nome do paciente:")
    val nome = readln()
    println("Peso em kg:")
    val peso = readln().trim().replace(',', '.').toDouble()
    println("Altura em metros:")
    val altura = readln().trim().replace(',', '.').toDouble()
    if (altura <= 0 || peso <= 0) {
        println("Peso ou altura inválidos.")
        return
    }
    val imc = peso / (altura * altura)
    val faixa = when {
        imc < 20 -> "abaixo do peso"
        imc <= 25 -> "normal"
        imc <= 30 -> "excesso de peso"
        imc <= 35 -> "obesidade"
        else -> "obesidade mórbida"
    }
    println("$nome: IMC %.2f, %s".format(imc, faixa))
}
