package OOP

fun main(args: Array<String>) {
    var myComputer: Computer = Zte()
    //var myZte : OOP.Zte = OOP.Computer() as OOP.Zte

    var myNexus = Nexus()
    println("${myNexus.getName()} - ${myNexus.getRam()} - ${myNexus.getCPUType()}")

    var myIphone = Iphone()
    println("${myIphone.getName()} - ${myIphone.getRam()} - ${myIphone.getCPUType()}")
}

interface ComputerInterface {
    fun getName(): String
    fun getRam(): Int
    fun getCPUType(): String
}

class Nexus : ComputerInterface {
    override fun getName(): String {
        return "OOP.Nexus 5"
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
        return "OOP.Iphone 5"
    }

    override fun getRam(): Int {
        return 3000;
    }

    override fun getCPUType(): String {
        return "A5"
    }
}


open class Computer {
    var computerName: String = "ZTE"
}

class Zte : Computer() {

}