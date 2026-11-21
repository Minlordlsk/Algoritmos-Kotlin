package algoritmos

fun main() {
    println("Pegue os ingredientes.")
    println("Está usando roupa branca (s/n):")
    val roupa = readln()
    if (roupa.equals("s", true)) println("Coloque um avental.")
    println("Tem batedeira (s/n):")
    val batedeira = readln()
    println(if (batedeira.equals("s", true)) "Bata na batedeira." else "Bata à mão.")
    println("Coloque a massa na forma.\nLeve ao forno.\nAguarde o tempo necessário.\nRetire o bolo.")
}
