package lesson4

fun main() {

    var exercisesForHands = 5
    var exercisesForLegs = 0
    var exercisesForBack = 0
    var exercisesForPress = 5

    val continueExercisesForHands = (exercisesForHands > 30) || (exercisesForHands >= 5)
    val continueExercisesForLegs = (exercisesForLegs > 30) || (exercisesForLegs >= 5)
    val continueExercisesForBack = (exercisesForBack) > 30 || (exercisesForBack >= 5)
    val continueExercisesForPress = (exercisesForPress > 30) || (exercisesForPress >= 5)

    println("""
        Упражнения для рук: $continueExercisesForHands
        Упражнения для ног: $continueExercisesForLegs
        Упражнения для спины: $continueExercisesForBack
        Упражнения для пресса: $continueExercisesForPress
    """.trimIndent())
}