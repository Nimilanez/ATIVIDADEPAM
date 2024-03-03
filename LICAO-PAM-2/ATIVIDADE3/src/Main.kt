import kotlin.math.sqrt
fun calcularAreaTrianguloEquilatero(comprimentoLado: Double): Double {
    val area = (comprimentoLado * comprimentoLado * sqrt(3.0)) / 4
    return area
}

fun main() {
    val comprimentoLado = 6.0
    val area = calcularAreaTrianguloEquilatero(comprimentoLado)
    println("A área do triângulo equilátero é: $area")
}

