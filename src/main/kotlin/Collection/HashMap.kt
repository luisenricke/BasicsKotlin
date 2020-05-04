package Collection

fun main(args: Array<String>) {
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

    //HashMapOf
    var dictionaryHashMap = hashMapOf<String,String>("Hello" to "Hola", "Nice" to "Genial")
    println()
    println(dictionaryHashMap["Hello"])
}