fun main(args: Array<String>) {

    var myPerson:Person = Person()
    myPerson.name="Luis"
    println(myPerson.name)

    var student:Student = Student()
    student.name="Luis"
    student.StudentID=123
    println(student.StudentID!!)
    
}

open class Person() {
    var name: String? = null
    var age: Int? = null
    var height: Int? = null
}

class Student(): Person(){
    var StudentID: Int?=null
}

class Employee ():Person(){
    var EmployeeID:Int?=null
}