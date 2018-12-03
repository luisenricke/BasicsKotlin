package Advanced

import java.lang.Exception

fun main(args: Array<String>) {
    var lion = Animal("Lion")
    lion.start()

    lion.join()

    var elephant = Animal("Elephant")
    elephant.start()

    var monkey = Animal("Monkey")
    monkey.start()

    var bear = Animal("Bear")
    bear.start()
}

class Animal: Thread{
    var animalName: String = ""

    constructor(name:String){
        animalName = name
    }

    override fun run() {
        super.run()
        var counter = 0

        while (counter <5){
            println("$animalName is running - $counter")
            counter++

            try {
                Thread.sleep(2000)
            }catch (ex:Exception){
                println(ex.message)
            }
        }
    }
}