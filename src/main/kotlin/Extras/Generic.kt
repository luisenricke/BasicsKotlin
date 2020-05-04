package Extras

fun main(args: Array<String>) {
    var myAnimal = GenericAnimalClass("OOP.Lion")
}

class GenericAnimalClass<T>(kind: T){
    init {
        println(kind)
    }
}