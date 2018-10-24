package OOP

fun main(args: Array<String>) {
    var myPerson: Person = Person()
    myPerson.name = "Luis"
    println(myPerson.name)

    var myStudent: Student = Student()
    myStudent.name = "Luis"
    myStudent.StudentID = 123
    println(myStudent.StudentID!!)

    var overridePerson: Person = Person()
    overridePerson.older()

    var overrideStudent: Student = Student()
    overrideStudent.older()
}

open class Person() {
    var name: String? = null
    var age: Int? = null
    var height: Int? = null

    open fun older() {
        println("The person is alive")
    }
}

class Student() : Person() {
    var StudentID: Int? = null
    override fun older() {
        println("The person is a student")
    }
}

class Employee() : Person() {
    var EmployeeID: Int? = null
}