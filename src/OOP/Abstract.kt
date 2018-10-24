package OOP

fun main(args: Array<String>) {
    //var myAnimal :OOP.Animal = OOP.Animal()//Abstract class can not be instantieated
    var myLion = Lion()
    println("${myLion.getName()} - ${myLion.getSpeedLion()}")

    var myCat = Cat()
    println("${myCat.getName()} - ${myCat.getSpeed()}")
}

abstract class Feline {
    abstract fun getName(): String

    open fun getSpeed(): Int {
        return 100
    }
}

class Lion : Feline() {
    override fun getName(): String {
        return "OOP.Lion"
    }

    fun getSpeedLion():Int{
        return getSpeed()
    }
}

class Cat : Feline() {
    override fun getName(): String {
        return "OOP.Cat"
    }

    override fun getSpeed(): Int {
        return 50
    }
}




