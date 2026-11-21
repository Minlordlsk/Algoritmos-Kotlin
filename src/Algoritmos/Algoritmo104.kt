package algoritmos

fun main() {
    println("Nome:")
    val nome = readln()
    println("Sexo (F/M):")
    val sexo = readln()
    println("Idade:")
    val idade = readln().trim().toInt()
    val situacao = if (sexo.trim().equals("f", true) && idade < 25) "ACEITA" else "NÃO ACEITA"
    println("$nome: $situacao")
}
