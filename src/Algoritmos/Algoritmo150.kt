package algoritmos

import kotlin.math.*

fun main() {
    println("Ângulo em graus:")
    val graus = readln().trim().replace(',', '.').toDouble()
    val normalizado = ((graus % 360) + 360) % 360
    val radianos = normalizado * PI / 180
    val quadrantePar = normalizado > 90 && normalizado <= 180 || normalizado > 270 || normalizado == 0.0
    println(if (quadrantePar) "Seno: " + sin(radianos) else "Cosseno: " + cos(radianos))
}
