package lesson3

const val name = "Татьяна"
var surname = "Андреева"
const val patronymic = "Сергеевна"
var age = 20

fun main() {
    println("$surname $name $patronymic, $age лет")
    println(getMarried())
}

fun getMarried() {
    surname = "Сидорова"
    age = 22
    println("$surname $name $patronymic, $age года")

}