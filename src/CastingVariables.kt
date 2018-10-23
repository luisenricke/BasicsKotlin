fun main(args: Array<String>) {

    var myIntValue: Int = 10
    var myIntValueAsString: String

    myIntValueAsString = myIntValue.toString()
    println(myIntValueAsString)

    /*
    var myStringValue:String ="Error of Casting"
    var myStringValueAsInteger :Int = myStringValue.toInt()
    println(myStringValueAsInteger)
    */

    var myStringValue: String = "123"
    var myStringValueAsInteger: Int = myStringValue.toInt()
    println(myStringValueAsInteger)

    var mySecondIntValue: Int = 12
    var myDoubleValue: Double = mySecondIntValue.toDouble()
    println(myDoubleValue)

    var mySecondDoubleValue: Double = 3.1416
    var myThirdIntValue: Int = mySecondDoubleValue.toInt()
    println(myThirdIntValue)
}