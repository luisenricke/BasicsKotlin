package Lambdas

fun main() {
    { println("Lambdas simple :D") }()
    val test = { println("Lambdas in variable :D") }()

    val sum = { a: Int, b: Int -> a + b }
    println("Sum is : ${sum(1, 2)}")
    println("Sum is: ${{ a: Int, b: Int -> a + b }(2, 2)}")

    println(Math.random())
    println({Math.random()})
}