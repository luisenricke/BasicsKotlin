package Collection

fun main(args: Array<String>) {
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
}