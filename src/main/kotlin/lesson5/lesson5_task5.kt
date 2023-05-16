package lesson5

fun main() {

   val randomWinNumberOne = (0..100).random()
   val randomWinNumberTwo = (0..100).random()

    println("Введите первое число от 0 до 100")
    val numberOne = readln().toInt()
    println("Введите второе число от 0 до 100")
    val numberTwo = readln().toInt()

    if ((randomWinNumberOne == numberOne) && (randomWinNumberTwo == numberTwo)) {
        println("Вы выйграли главный приз!")
    } else if ((randomWinNumberOne == numberOne) || (randomWinNumberTwo == numberTwo)) {
        println("Вы выйграли утешительный приз")
    } else {
        println("Вы ничего не выйграли")
    }

    println("Выйгрышные числа - $randomWinNumberOne и $randomWinNumberTwo")
}