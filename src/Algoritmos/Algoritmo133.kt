package algoritmos

fun main() {
    println("Altura em metros:")
    val altura = readln().trim().replace(',', '.').toDouble()
    println("Sexo (M/F):")
    val sexo = readln()
    println(when (sexo.trim().uppercase()) {
        "M" -> "Peso ideal: %.2f kg".format(72.7 * altura - 58)
        "F" -> "Peso ideal: %.2f kg".format(62.1 * altura - 44.7)
        else -> "Sexo inválido."
    })
}
