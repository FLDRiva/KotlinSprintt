package lesson5

fun main() {

    println("Введите год рождения")
    val yearOfBirth = readln().toInt()
    val age = YEAR_IS_TODAY - yearOfBirth

    if (age >= COMING_OF_AGE) {
        println("Показать экран со скрытым контентом")
    } else {
        return
    }

}

const val COMING_OF_AGE = 18
const val YEAR_IS_TODAY = 2023