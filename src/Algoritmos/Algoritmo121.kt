package algoritmos

fun main() {
    println("Primeiro inteiro:")
    val primeiro = readln().trim().toInt()
    var menor = primeiro
    var maior = primeiro
    for (posicao in 2..5) {
        println("Inteiro $posicao:")
        val numero = readln().trim().toInt()
        if (numero < menor) menor = numero
        if (numero > maior) maior = numero
    }
    println("Maior: $maior")
    println("Menor: $menor")
}
