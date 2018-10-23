fun main(args: Array<String>) {
    //Arrays
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

    //ArrayList
    var partyList: ArrayList<String> = ArrayList<String>()
    partyList.add("Luis")
    partyList.add("Nashe")
    partyList.add("Fechis")
    partyList.add("Chacon")
    partyList.add("Paty")

    println("The fistt item: " + partyList.get(0))
    println("The last item: " + partyList.get(4))

    println()
    for (name in partyList) {
        println(name)
    }

    partyList.set(0, "Enrique")

    println()
    for (name in partyList) {
        println(name)
    }

    println()
    if (partyList.contains("Jax")) {
        println("Jax is also invited")
    } else {
        println("Sorry, Jax is not invited")
    }

    println()

    println("Party List by Index")
    for (index in 0..partyList.size - 1) {
        println(partyList[index])
    }

    partyList.remove("Chacon")

    println()
    for (index in 0..partyList.size - 1) {
        println(partyList[index])
    }

    partyList.removeAt(2)

    println()
    for (index in 0..partyList.size - 1) {
        println(partyList[index])
    }

    //HashMap
    var dictionary = HashMap<String, String>()
    dictionary.put("Hello", "Hola")
    dictionary.put("Nice", "Genial")
    dictionary.put("Fantastic", "Fantastico")
    dictionary.put("Support", "Soporte")

    println(dictionary["Hello"])
    println(dictionary.get("Genial"))

    println()

    println("All Keys")
    for (key in dictionary.keys) {
        println(key)
    }

    println()
    println("All values")
    for (values in dictionary.values) {
        println(values)
    }

    println()
    println("Updateing dictionary")
    dictionary.put("Hello", "Hola, como estas?")
    println(dictionary["Hello"])

    println()
    println("Deleting dictionary")
    dictionary.remove("Support")
    for (key in dictionary.keys) {
        println(key)
    }


    var myIntStringHashMap = HashMap<Int, String>()
    myIntStringHashMap.put(1, "V")
    var myStringIntHashMap = HashMap<String, Int>()
    myStringIntHashMap.put("K", 1)

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

    //HashMapOf
    var dictionaryHashMap = hashMapOf<String,String>("Hello" to "Hola",
            "Nice" to "Genial")
    println()
    println(dictionaryHashMap["Hello"])

    //Set
    var animals = setOf<String>("Lion","Monkey","Cat","Lion")
    println()
    for (animalName in animals){
        println(animalName)
    }
    //animals.add("Fish")//Error

    var animalsMutable = mutableSetOf<String>("Lion","Monkey","Cat","Lion")
    animalsMutable.add("Fish")//Error
    println()
    for (animalName in animalsMutable){
        println(animalName)
    }



}