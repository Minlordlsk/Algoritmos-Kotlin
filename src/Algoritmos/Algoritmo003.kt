package algoritmos

fun main() {
    println("A lâmpada está fora de alcance (s/n):")
    val alcance = readln()
    if (alcance.equals("s", true)) println("Pegue a escada.")
    println("Pegue a lâmpada nova.")
    println("A lâmpada queimada está quente (s/n):")
    val quente = readln()
    if (quente.equals("s", true)) println("Pegue um pano.")
    println("Retire a lâmpada queimada e coloque a nova.")
}
