package algoritmos

fun main() {
    println("Pontos do primeiro arqueiro:")
    val primeiro = readln().trim().toInt()
    println("Pontos do segundo arqueiro:")
    val segundo = readln().trim().toInt()
    println("Pontos do terceiro arqueiro:")
    val terceiro = readln().trim().toInt()
    for (pontos in listOf(primeiro, segundo, terceiro).sortedDescending()) println(pontos)
    val soma = primeiro + segundo + terceiro
    println(if (soma > 100) "Média: %.2f".format(soma / 3.0) else "Equipe desclassificada.")
}
