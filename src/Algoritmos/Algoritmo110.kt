package algoritmos

fun main() {
    println("Primeiro nome:")
    val a = readln()
    println("Segundo nome:")
    val b = readln()
    if (a.compareTo(b) <= 0) {
        println(a)
        println(b)
    } else {
        println(b)
        println(a)
    }
}
