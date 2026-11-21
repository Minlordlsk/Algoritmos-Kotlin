package algoritmos

fun main() {
    println("Nome:")
    val nome = readln()
    val prenome = nome.trim().substringBefore(' ')
    if (prenome in listOf("JOSÉ", "José", "josé")) println(nome)
}
