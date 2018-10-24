fun main(args: Array<String>) {

    var myCar : Car = Car()
    myCar.speed=100
    println(myCar.speed)

    var urCar : Car = Car()
    urCar.power=300
    println(urCar.power)
    println()
    println(Car().numberOfWheels)

    var myBoxer: Boxer = Boxer("Luis",100,100)


}

class Boxer(name:String, power:Int,speed:Int){
    private var name : String = ""
    private var power: Int? = null
    private var speed : Int = 0

    init {
        this.name = name
        this.speed = speed
        println(name + " - " + power + " - "+ speed )
    }

    fun getName(): String{
        return this.name
    }

}

class Car{
    var speed: Int = 0
    var power: Int = 0
    var name: String = ""
    var numberOfWheels: Int =0


}