package lesson1
fun main() {

    val onTheWay = 457
    val exitMinute = 9
    val exitSeconds = 39
    val travelTimeMinute = onTheWay + exitMinute + (exitSeconds / 60)
    val timeHour = travelTimeMinute / 60
    val timeMinute = travelTimeMinute - (timeHour * 60)

    println("Поезд проехал за $timeHour:$timeMinute")
}