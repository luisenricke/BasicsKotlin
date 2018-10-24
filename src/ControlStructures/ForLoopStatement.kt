package ControlStructures

fun main(args: Array<String>) {
    //For simple
    for (myNumber in 1..10) {
        println("Welcome - $myNumber")
    }

    //For Nested
    for (myNumber in 1..10) {
        println("Celebrity - $myNumber")
        for (mySecondNumber in 1..20) {
            println("Movie [$myNumber][$mySecondNumber]")
        }
    }
}