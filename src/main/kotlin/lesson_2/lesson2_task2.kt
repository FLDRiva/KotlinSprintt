package lesson_2

fun main() {

    val worker = 50
    val intern = 20

    val workerPrice = 30000
    val internPrice = 20000

    val workerSalary = workerPrice * worker
    val salary = (workerPrice + internPrice) * (worker + intern)
    val averageSalary = (workerPrice + internPrice) / (worker + intern)

    println(workerSalary)
    println(salary)
    println(averageSalary)
}