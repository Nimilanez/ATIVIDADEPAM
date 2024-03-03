fun calcularAreaTrianguloIsosceles(base: Double, altura: Double): Double {
    val area = (base * altura) / 2
    return area
}

fun main() {
    val base = 6.0
    val altura = 3.0
    val area = calcularAreaTrianguloIsosceles(base, altura)
    println("A área do triângulo isósceles é: $area")
}