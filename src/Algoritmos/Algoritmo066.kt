package algoritmos

fun main() {
    println("Tempo de viagem em horas:")
    val tempo = readln().trim().replace(',', '.').toDouble()
    println("Velocidade média em km/h:")
    val velocidade = readln().trim().replace(',', '.').toDouble()
    val distancia = tempo * velocidade
    println("Velocidade média: $velocidade km/h")
    println("Tempo: $tempo h")
    println("Distância: $distancia km")
    println("Combustível gasto: " + distancia / 12 + " L")
}
