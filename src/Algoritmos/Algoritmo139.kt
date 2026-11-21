package algoritmos

fun main() {
    println("Nome do município:")
    val municipio = readln()
    println("Quantidade de eleitores aptos:")
    val eleitores = readln().trim().toInt()
    println("Votos do candidato mais votado:")
    val votos = readln().trim().toInt()
    println(if (eleitores > 20000 && votos * 2L <= eleitores) "$municipio terá segundo turno." else "$municipio não terá segundo turno.")
}
