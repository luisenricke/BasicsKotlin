package Lambdas

fun main() {
    println(calculator(2, 3, ::sum))
    println(calculator(10, 5, ::sub))
    println(calculator(3, 2, ::mul))
    println(calculator(10, 5, ::div))
}


fun calculator(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun sum(a: Int, b: Int): Int = a + b
fun sub(a: Int, b: Int): Int = a - b
fun mul(a: Int, b: Int): Int = a * b
fun div(a: Int, b: Int): Int = a / b
