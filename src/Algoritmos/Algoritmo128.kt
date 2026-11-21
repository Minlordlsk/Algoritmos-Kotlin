package algoritmos

fun main() {
    println("Verbo no infinitivo:")
    val verbo = readln()
    println(when (verbo.trim().lowercase().takeLast(2)) {
        "ar" -> "Verbo da 1ª conjugação"
        "er" -> "Verbo da 2ª conjugação"
        "ir" -> "Verbo da 3ª conjugação"
        else -> "Verbo não está no infinitivo"
    })
}
