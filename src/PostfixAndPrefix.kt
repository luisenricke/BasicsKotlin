fun main(args: Array<String>) {


    var firstNumber :Int = 1
    println(firstNumber)

    firstNumber +=1
    println(firstNumber)

    firstNumber++ //Postfix
    println(firstNumber)

    ++firstNumber //Prefix
    println(firstNumber)

    firstNumber-- //Postfix
    println(firstNumber)

    --firstNumber //Prefix
    println(firstNumber)

    var secondNumber: Int = 10
    var thirdNumber : Int = secondNumber++
    println(thirdNumber)
    println(secondNumber)

    thirdNumber = ++secondNumber
    println(thirdNumber)



}