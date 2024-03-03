fun calcularAreaTrapezio(baseMaior: Double, baseMenor: Double, altura: Double): Double {
    val area = ((baseMaior + baseMenor) * altura) / 2
    return area
}

fun main() {
    val baseMaior = 10.0
    val baseMenor = 5.0
    val altura = 2.0
    val area = calcularAreaTrapezio(baseMaior, baseMenor, altura)
    println("A área do trapézio é: $area")
}