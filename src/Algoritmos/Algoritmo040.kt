package algoritmos

fun main() {
    println("Dividendo:")
    val dividendo = readln().trim().toInt()
    println("Divisor:")
    val divisor = readln().trim().toInt()
    println("Dividendo: $dividendo")
    println("Divisor: $divisor")
    if (divisor == 0) {
        println("Divisão por zero.")
    } else {
        println("Quociente: " + dividendo / divisor)
        println("Resto: " + dividendo % divisor)
    }
}
