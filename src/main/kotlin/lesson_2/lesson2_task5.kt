package lesson_2

fun main() {

    val initialAmount = 70000
    val interestRate = 16.7
    val depositAmountYear = 20
    val a = (1 + (interestRate / 1)) * (1 * 20)
    val futureValue = initialAmount * a
    println(futureValue.toInt())


}