fun calcularAreaLosango(diagonalMaior: Double, diagonalMenor: Double): Double {
    val area = (diagonalMaior * diagonalMenor) / 2
    return area
}

fun main() {
    val diagonalMaior = 8.0
    val diagonalMenor = 3.0
    val area = calcularAreaLosango(diagonalMaior, diagonalMenor)
    println("A área do losango é: $area")
}