fun main(args: Array<String>) {

    var myPerson: Person = Person()
    myPerson.name = "Luis"
    println(myPerson.name)

    var myStudent: Student = Student()
    myStudent.name = "Luis"
    myStudent.StudentID = 123
    println(myStudent.StudentID!!)

    var overridePerson: Person = Person()
    overridePerson.older()

    var overrideStudent: Student = Student()
    overrideStudent.older()

    var myComputer: Computer = Zte()
    //var myZte : Zte = Computer() as Zte

    var myNexus = Nexus()
    println("${myNexus.getName()} - ${myNexus.getRam()} - ${myNexus.getCPUType()}")

    var myIphone = Iphone()
    println("${myIphone.getName()} - ${myIphone.getRam()} - ${myIphone.getCPUType()}")

    //var myAnimal :Animal = Animal()//Abstract class can not be instantieated
    var myLion = Lion()
    println("${myLion.getName()} - ${myLion.getSpeedLion()}")

    var myCat = Cat()
    println("${myCat.getName()} - ${myCat.getSpeed()}")
}

//Abstract
abstract class Feline {
    abstract fun getName(): String

    open fun getSpeed(): Int {
        return 100
    }
}

class Lion : Feline() {
    override fun getName(): String {
        return "Lion"
    }

    fun getSpeedLion():Int{
        return getSpeed()
    }
}

class Cat : Feline() {
    override fun getName(): String {
        return "Cat"
    }

    override fun getSpeed(): Int {
        return 50
    }
}


//Interface
interface ComputerInterface {
    fun getName(): String
    fun getRam(): Int
    fun getCPUType(): String
}

class Nexus : ComputerInterface {
    override fun getName(): String {
        return "Nexus 5"
    }

    override fun getRam(): Int {
        return 1000;
    }

    override fun getCPUType(): String {
        return "SnapDragon"
    }
}

class Iphone : ComputerInterface {
    override fun getName(): String {
        return "Iphone 5"
    }

    override fun getRam(): Int {
        return 3000;
    }

    override fun getCPUType(): String {
        return "A5"
    }
}

//Casting classes
open class Computer {
    var computerName: String = "ZTE"
}

class Zte : Computer() {

}

//Inherintance and overriding
open class Person() {
    var name: String? = null
    var age: Int? = null
    var height: Int? = null

    open fun older() {
        println("The person is alive")
    }
}

class Student() : Person() {
    var StudentID: Int? = null
    override fun older() {
        println("The person is a student")
    }
}

class Employee() : Person() {
    var EmployeeID: Int? = null
}