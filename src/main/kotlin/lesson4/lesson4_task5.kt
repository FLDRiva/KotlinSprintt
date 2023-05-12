package lesson4

fun main() {

    println(setSail())

}

fun setSail() {

    println("Повреждения корпуса")
    val damage = readln()
    if ((damage != SERIOUS_DAMAGE) && (damage != WEAK_DAMAGE)) {
        println(true)
    } else if ((damage != SERIOUS_DAMAGE) && (damage != NO_DAMAGE)) {
        println(true)
    } else {
        println(false)
    }

    println("текущая численность экипажа")
    val crew = readln().toInt()
    println(crew)

    println("текущее количество ящиков провизии")
    val provisions = readln().toInt()
    println(provisions)

    println("благоприятные ли метеоусловия")
    val weather = readln()
    if (weather == FAVORABLE_WEATHER_CONDITIONS) {
        println(true)
    } else {
        println(false)
    }

    if ((damage == NO_DAMAGE) && (crew in 55..70) && (provisions > 50) &&
        (weather == FAVORABLE_WEATHER_CONDITIONS) || (weather == ADVERSE_WEATHER_CONDITIONS)
    ) {
        println("Можно отправляться в плаванье")
    } else if ((damage == WEAK_DAMAGE) && (crew == 70) && (provisions > 50) &&
        weather == FAVORABLE_WEATHER_CONDITIONS
    ) {
        println("Можно отправляться в плаванье")
    } else {
        println("Запрещенно отправляться в плаванье")
    }
}

const val SERIOUS_DAMAGE = "серьезные"
const val WEAK_DAMAGE = "незначительные"
const val NO_DAMAGE = "нет"
const val FAVORABLE_WEATHER_CONDITIONS = "благоприятные"
const val ADVERSE_WEATHER_CONDITIONS = "неблагоприятные"
