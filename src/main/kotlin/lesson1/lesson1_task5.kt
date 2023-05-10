package lesson1

fun main() {

    val seconds = 108
    val minute = seconds / 60
    val seconds1 = seconds.toString().dropLast(1)
    println("0$minute:$seconds1")

}