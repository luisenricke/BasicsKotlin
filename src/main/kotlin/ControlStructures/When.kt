package ControlStructures

fun main(args: Array<String>) {
    var personAge = 22
    when (personAge) { //It's like a switch
        1 -> {
            println("It's a baby with $personAge")
        }

        5, 6, 7, 8, 9, 10 -> {
            println("It's a boy with $personAge")
        }

        in 11..19 -> {
            println("Its a teen with $personAge")
        }
        /*
        !in 2..4 ->{
            println("It's not a baby")
        }*/

        else -> {
            println("You're probably dead")
        }
    }

    //When as expresion
    var boxerPunchSpeed = 100
    var isAFastBoxer = when (boxerPunchSpeed) {
        200 -> true
        else -> false
    }
    println(isAFastBoxer)
}