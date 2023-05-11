package lesson1

fun main() {

    val onTheWay = 457
    val exitMinute = 9
    val exitSeconds = 39
    val travelTimeMinute = onTheWay + exitMinute + (exitSeconds / 60)
    val TimeHour = travelTimeMinute / 60
    val TimeMinute = travelTimeMinute - (TimeHour * 60)


    println("Поезд проехал за $TimeHour:$TimeMinute")

}