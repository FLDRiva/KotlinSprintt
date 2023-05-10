package lesson2

fun main() {

    val initialAmount = 70000
    val interestRate = 16.7
    val depositAmountYear = 20
    val a = (1 + (interestRate / 100)) * depositAmountYear
    var futureAmount = initialAmount * a

    println(futureAmount)

}

