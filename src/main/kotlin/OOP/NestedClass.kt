package OOP

fun main(args: Array<String>) {
    var outerAnimal = OuterAnimal()
    var nestedLion = OuterAnimal.StaticLiohClass()
    var innerTiger = OuterAnimal().NonStaticTigerClass ()
    innerTiger.printAnimalName()


}

class OuterAnimal {
    private var animalName: String = ""

    class StaticLiohClass {
        fun printAnimalName() {
            //println(animalName)//Static classes can not acces members of the enclosing class
        }
    }

    inner class NonStaticTigerClass {
        fun printAnimalName() {
            println(animalName)
        }
    }
}