
package algoritmos

fun main() {
    println("Idade:")
    val idade = readln().trim().toInt()
    println(when {
        idade < 16 -> "Não-eleitor"
        idade < 18 || idade > 65 -> "Eleitor facultativo"
        else -> "Eleitor obrigatório"
    })
}
