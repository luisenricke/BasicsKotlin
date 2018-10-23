fun main(args: Array<String>) {

    //When
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

    //If as expresion
    var numberOfCars = 50
    var numberOfBicycles = 100
    var maximumValue = if (numberOfCars < numberOfBicycles) numberOfBicycles else numberOfCars
    println(maximumValue)

    //When as expresion
    var boxerPunchSpeed = 100
    var isAFastBoxer = when (boxerPunchSpeed) {
        200 -> true
        else -> false
    }
    println(isAFastBoxer)

    //For
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

    //While
    var haveMonkey: Boolean = true
    var count = 0
    while (count < 5 && haveMonkey) {
        println("Keep spending")
        count++
    }

    //Do-While
    var peopleAreFriendly: Boolean = true
    count = 0
    do {
        println("Talk to people")
        count++
    } while (peopleAreFriendly && count < 5)

    //break and continue
    for (myNumber in 1..10) {
        if (myNumber == 5)
            continue

        if (myNumber == 10)
            break

        println("Loop - $myNumber")
    }

}