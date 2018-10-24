package ControlStructures

fun main(args: Array<String>) {
    var numberOfCars = 50
    var numberOfBicycles = 100
    var maximumValue = if (numberOfCars < numberOfBicycles) numberOfBicycles else numberOfCars
    println(maximumValue)


}