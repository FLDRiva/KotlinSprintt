package lesson3

val name = "Татьяна"
var surname = "Андреева"
val patronymic = "Сергеевна"
var age = 20

fun main() {

    println("$surname $name $patronymic, $age лет")
    println(marriage())
}

fun marriage() {

    surname = "Сидорова"
    age = 22
    println("$surname $name $patronymic, $age года")

}