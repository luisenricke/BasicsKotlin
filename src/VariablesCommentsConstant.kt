fun main(args: Array<String>) {

    var myPlaceHolder = "My value"
    //println(myPlaceHolder)

    /*
    myPlaceHolder = "Another value"
     println(myPlaceHolder)
     */

    var age: Int = 22
    var name: String = "Luis "
    var lastName: String = "Villalobos"
    var height: Float = 178.2f
    println("Hello my name is " + name + lastName)
    println("I'm " + age + " years old and " + height + " tall")

    val PI: Double = 3.1416
    println(PI)

    var myVariableNull: String? //Variable optional
    myVariableNull = null
    println(myVariableNull)

    /* Error, not null
    var anotherVarible: String
    anotherVarible = null
    */

    var nullSafty: Int? = null

    //println(nullSafty!!) //!! -> throws error if have null

}