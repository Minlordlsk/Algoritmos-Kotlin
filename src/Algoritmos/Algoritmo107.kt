package algoritmos

fun main() {
    println("Nome:")
    val nome = readln()
    if (nome.trim().substringBefore(' ') == "JOSÉ") println(nome)
}
