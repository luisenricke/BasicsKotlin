package ControlStructures

fun main(args: Array<String>) {
    var peopleAreFriendly: Boolean = true
    var count = 0
    do {
        println("Talk to people")
        count++
    } while (peopleAreFriendly && count < 5)
}