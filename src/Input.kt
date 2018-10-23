fun main(args: Array<String>) {

    /*println("How are u?")
    var feel = readLine()
    println("I hope u are well")
    println("How old are u?")
    var age: Int? = readLine()!!.toInt()
    println("U have "+ age)*/
    println("Please enter the first number : ")
    var num1 : Int = readLine()!!.toInt()
    println("Please enter the second number : ")
    var num2 : Int = readLine()!!.toInt()
    println("the sum is " + (num1+num2) + "\n" +
            "the substraction is " + (num1-num2) + "\n" +
            "the multiplication is " + (num1*num2) + "\n" +
            "the division is " + (num1/num2))
}