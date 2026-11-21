package algoritmos

fun main() {
    println("Hora atual:")
    val hora = readln().trim().toInt()
    println("Minutos:")
    val minuto = readln().trim().toInt()
    println("Minutos desde o início do dia: " + (hora * 60 + minuto))
}
