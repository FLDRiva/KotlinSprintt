package lesson3

fun main() {

    val movie = "D2-D4;0"
    val share1 = "-"
    val share2 = ";"
    val data = movie.split(share1, share2)
    val movie1 = data[0]
    val movie2 = data[1]
    val number = data[2]

    println("из $movie1")
    println("на $movie2")
    println("номер хода $number")
}