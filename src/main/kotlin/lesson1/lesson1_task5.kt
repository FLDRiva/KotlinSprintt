package lesson1

var seconds = 6480
fun main() {

    println(timeOfGagarin())

}

fun timeOfGagarin (): String {

    val minute = (seconds % 3600) / 60
    val second = seconds % 60
    return String.format("%02d:%02d", minute, second)

}