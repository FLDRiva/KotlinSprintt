package lesson4

const val TOTAL_TABLES = 13

fun main() {

    val tableToday = 13
    val tableTomorrow = 9
    val freeTableToDay = tableToday > TOTAL_TABLES
    val freeTableToTomorrow = tableTomorrow < TOTAL_TABLES
    println("Доступность столиков на сегодня: $freeTableToDay " +
            "\nДоступность столиков на завтра: $freeTableToTomorrow")
}