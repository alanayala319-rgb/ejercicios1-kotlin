package ejercicios// EJERCICIO 2: Condicionales (if / else)
// ========================================
// Dada una lista de calificaciones, clasifica cada una e imprime su nivel:
//   - Reprobado (0-59)
//   - Suficiente (60-69)
//   - Bien (70-79)
//   - Notable (80-89)
//   - Excelente (90-100)
//
// Salida esperada:
// 45 -> Reprobado
// 72 -> Bien
// 91 -> Excelente
// 60 -> Suficientee
// 85 -> Notable

fun main() {
    val calificaciones = listOf(45, 72, 91, 60, 85)

    for (cal in calificaciones) {
        val nivel = if (cal < 60) {
            "Reprobado"
        } else if (cal < 70) {
            "Bien"
        } else if (cal < 80) {
            "Muy bien"
        } else if (cal < 90) {
            "notable"
        } else {
            "excelente"
        }

        println("$cal -> $nivel")
    }
}
