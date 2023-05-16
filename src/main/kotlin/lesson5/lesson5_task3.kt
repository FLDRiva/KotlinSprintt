package lesson5

fun main() {

    val numberOne = 55
    val numberTwo = 23

    println("Введите первое число от 1 до 100")
    val hiddenNumberOne = readln().toInt()
    println("Введите второе число от 1 до 100")
    val hiddenNumberTwo = readln().toInt()

    if ((hiddenNumberOne == numberOne) && (hiddenNumberTwo == numberTwo)) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if ((hiddenNumberOne == numberOne) || (hiddenNumberTwo == numberTwo)) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача! Крутите барабан!")
    }
}