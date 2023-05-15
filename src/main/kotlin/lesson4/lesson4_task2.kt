package lesson4

fun main() {

    val cargoOneWeight = 20
    val cargoTwoWeight = 50
    val cargoOneValue = 80
    val cargoTwoValue = 100

    println("Average для груза с весом 20 кг и объемом 80 л: ${(WEIGHT_MIN < cargoOneWeight) && 
            (cargoOneWeight <= WEIGHT_MAX) && (VALUE > cargoOneValue)} \n" +
            "Average для груза с весом 50 кг и объемом 100 л: ${(WEIGHT_MIN < cargoTwoWeight) && 
                    (cargoTwoWeight <= WEIGHT_MAX) && (VALUE > cargoTwoValue)}")
}

const val VALUE = 100
const val WEIGHT_MAX = 100
const val WEIGHT_MIN = 30