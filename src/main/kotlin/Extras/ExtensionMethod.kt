package Extras

fun main(args: Array<String>) {
    var list : ArrayList<Int> = ArrayList<Int>()
    list.add(1)
    list.add(2)
    list.add(3)
    list.addTwoNumbers(list[1],list[2])
}

fun ArrayList<Int>.addTwoNumbers(number1:Int,number2: Int):Int{
    var result = number1+number2
    println(result)
    return result
}