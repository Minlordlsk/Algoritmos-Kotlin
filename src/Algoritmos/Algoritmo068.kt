package algoritmos

fun main() {
    println("Valor de A:")
    var a = readln().trim().replace(',', '.').toDouble()
    println("Valor de B:")
    var b = readln().trim().replace(',', '.').toDouble()
    val auxiliar = a
    a = b
    b = auxiliar
    println("A = $a")
    println("B = $b")
}
