package Collection

fun main(args: Array<String>) {
    var partyNames = Array<String>(10) { "" }
    partyNames[0] = "Luis"
    println(partyNames[0])

    println()
    for (name in partyNames) {
        println(name)
    }

    /*
    println("Set the names for the invited")
    for (setName in 0..9){
        partyNames[setName] = readLine()!!
        println(partyNames[setName]+" is invited to the party")
    }
    */




    //ArrayOf
    var guests = arrayOf("Luis", "Nashe", "Chacon")
    println(guests[0])

        //NoMutable
    var guestList = listOf<String>("Fer", "Jax","Ninel")
    println(guestList[2])

    //guestList[0]="xd"//Error

        //Mutable
    var guestListMutable = mutableListOf<String>("Fer", "Jax","Ninel")
    guestListMutable[0]="Someone else"

    var guestArrayList = arrayListOf<String>("A","B","C")
    guestArrayList.add("D")
    guestArrayList.remove("B")

    println()
    for (list in guestArrayList){
        println(list)
    }







}