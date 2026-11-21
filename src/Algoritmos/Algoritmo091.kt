package algoritmos

fun main() {
    println("Primeiro inteiro:")
    val a = readln().trim().toInt()
    println("Segundo inteiro:")
    val b = readln().trim().toInt()
    val soma = a + b
    if (soma > 10) println(soma)
}
