package ControlStructures

fun main(args: Array<String>) {
    var haveMonkey: Boolean = true
    var count = 0
    while (count < 5 && haveMonkey) {
        println("Keep spending")
        count++
    }
}