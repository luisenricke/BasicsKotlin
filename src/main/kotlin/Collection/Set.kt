package Collection

fun main(args: Array<String>) {
    var animals = setOf<String>("OOP.Lion","Monkey","OOP.Cat","OOP.Lion")
    println()
    for (animalName in animals){
        println(animalName)
    }
    //animals.add("Fish")//Error

    var animalsMutable = mutableSetOf<String>("OOP.Lion","Monkey","OOP.Cat","OOP.Lion")
    animalsMutable.add("Fish")//Error
    println()
    for (animalName in animalsMutable){
        println(animalName)
    }
}