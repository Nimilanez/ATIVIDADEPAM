import kotlin.math.PI

fun calcularCircunferencia(raio: Double): Double {
    val circunferencia = 2 * PI * raio
    return circunferencia
}

fun main() {
    val raio = 7.0
    val circunferencia = calcularCircunferencia(raio)
    println("A circunferência do círculo é: $circunferencia")
}