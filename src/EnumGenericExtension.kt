fun main(args: Array<String>) {
    println(GameStatus.WON)
    println(GameStatus.LOSS)
    println(Feel.Good)

    var myAnimal = GenericAnimalClass("Lion")

    var list : ArrayList<Int> = ArrayList<Int>()
    list.add(1)
    list.add(2)
    list.add(3)
    list.addTwoNumbers(list[1],list[2])
}

//Extension Method
fun ArrayList<Int>.addTwoNumbers(number1:Int,number2: Int):Int{
    var result = number1+number2
    println(result)
    return result
}

//Generic
class GenericAnimalClass<T>(kind: T){
    init {
        println(kind)
    }
}

//Enums
enum class GameStatus{
    WON,LOSS
}

enum class Feel{
    Good, Soso, Bad
}
