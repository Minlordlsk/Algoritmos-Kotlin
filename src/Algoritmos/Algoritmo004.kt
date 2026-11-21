package algoritmos

fun main() {
    println("A previsão é de sol (s/n):")
    val sol = readln()
    println(if (sol.equals("s", true)) "Ir à praia." else "Estudar.")
    println("Almoçar.\nVer televisão.\nDormir.")
}
