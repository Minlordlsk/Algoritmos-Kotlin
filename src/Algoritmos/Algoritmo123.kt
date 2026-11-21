package algoritmos

fun main() {
    println("Primeiro lado:")
    val a = readln().trim().replace(',', '.').toDouble()
    println("Segundo lado:")
    val b = readln().trim().replace(',', '.').toDouble()
    println("Terceiro lado:")
    val c = readln().trim().replace(',', '.').toDouble()
    println(when {
        a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a -> "Não formam um triângulo."
        a == b && b == c -> "Equilátero"
        a == b || a == c || b == c -> "Isósceles"
        else -> "Escaleno"
    })
}
