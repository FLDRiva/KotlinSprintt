package lesson5

fun main() {

    val login = "Batman"
    val password = "password"

    println("Введите логин")
    val userLogin = readln()
    if (userLogin == login) {
        println("Введите пароль")
        val userPassword = readln()
        if (userPassword == password) {
            println("Приветствую, $login!")
        } else {
            println("ошибка авторизации")
        }
    } else {
        println("Пройдите регистрацию")
    }
}