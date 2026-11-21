package algoritmos

fun main() {
    println("Sigla do estado:")
    val estado = readln()
    println(when (estado.trim().uppercase()) {
        "RJ" -> "carioca"
        "SP" -> "paulista"
        "MG" -> "mineiro"
        else -> "outros estados"
    })
}
