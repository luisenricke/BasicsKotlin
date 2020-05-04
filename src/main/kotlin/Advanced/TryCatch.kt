package Advanced

import java.lang.Exception

fun main(args: Array<String>) {
    println("Please enter a number: ")
    try {
        var myIntValue :Int = readLine()!!.toInt()
        println(myIntValue)
    }catch (e: Exception){
        //e.printStackTrace()
        println(e.message)
    }
}