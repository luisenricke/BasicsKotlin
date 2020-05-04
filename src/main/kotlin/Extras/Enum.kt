package Extras

fun main(args: Array<String>) {
    println(GameStatus.WON)
    println(GameStatus.LOSS)
    println(Feel.Good)
}

enum class GameStatus{
    WON,LOSS
}

enum class Feel{
    Good, Soso, Bad
}