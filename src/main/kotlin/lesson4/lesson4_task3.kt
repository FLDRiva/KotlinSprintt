package lesson4

fun main() {

    val weather = "солнечная погода"
    val awningOptions = "тент раскрыт"
    val humidity = 20
    val season = "зима"

    val beanGrowth = (weather == "солнечная погода") && (awningOptions == "тент раскрыт") && (humidity == 20)
            && (season != "зима")
    println("Благоприятные ли условия сейчас для роста бобовых? $beanGrowth")
}