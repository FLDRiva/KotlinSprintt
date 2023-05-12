package lesson4

fun main() {

    val weightMin = 30
    val weightMax = 100
    val value = 99

    val cargoOneWeight = 20
    val cargoTwoWeight = 50
    val cargoOneValue = 80
    val cargoTwoValue = 100

    println("Average для груза с весом 20 кг и объемом 80 л: ${(weightMin < cargoOneWeight) && 
            (cargoOneWeight <= weightMax) && (value > cargoOneValue)} \n" +
            "Average для груза с весом 50 кг и объемом 100 л: ${(weightMin < cargoTwoWeight) && 
                    (cargoTwoWeight <= weightMax) && (value > cargoTwoValue)}")
}