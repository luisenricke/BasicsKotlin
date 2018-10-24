package ControlStructures

fun main(args: Array<String>) {
    for (myNumber in 1..10) {
        if (myNumber == 5)
            continue
        if (myNumber == 10)
            break
        println("Loop - $myNumber")
    }
}