import kotlin.math.sqrt

fun calcularAreaTrianguloEscaleno(a: Double, b: Double, c: Double): Double {
    val s = (a + b + c) / 2
    val area = sqrt(s * (s - a) * (s - b) * (s - c))
    return area
}

fun main() {
    val lado1 = 7.0
    val lado2 = 4.0
    val lado3 = 9.0
    val area = calcularAreaTrianguloEscaleno(lado1, lado2, lado3)
    println("A área do triângulo escaleno é: $area")
}