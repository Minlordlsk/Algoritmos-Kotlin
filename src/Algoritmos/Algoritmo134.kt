package algoritmos

fun main() {
    println("Idade do nadador:")
    val idade = readln().trim().toInt()
    println(when (idade) {
        in 5..7 -> "Infantil A"
        in 8..10 -> "Infantil B"
        in 11..13 -> "Juvenil A"
        in 14..17 -> "Juvenil B"
        in 18..Int.MAX_VALUE -> "Sênior"
        else -> "Sem categoria."
    })
}
