package algoritmos

fun main() {
    println("Peso em quilogramas, só a parte inteira:")
    val peso = readln().trim().toInt()
    println("Peso em gramas: " + peso * 1000L)
    println("Novo peso em gramas: " + peso * 1120L)
}
