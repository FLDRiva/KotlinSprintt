package lesson4

fun main() {

    val weather = "солнечная погода"
    val isAwningOpen = true
    val humidity = 20
    val season = "зима"

    val beanGrowth = (weather == "солнечная погода") && (isAwningOpen) && (humidity == 20)
            && (season != "зима")
    println("Благоприятные ли условия сейчас для роста бобовых? $beanGrowth")
}