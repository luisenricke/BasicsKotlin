package PatternDesign

fun main(args: Array<String>) {
    var db = DBInstance.instance
    println(db.dbname)
    db.dbname = "Horarios"
    println(db.dbname)
}

class DBInstance{
    var dbname : String = "Tienda"

    private constructor(){
        println("database created")
    }

    companion object {
        val instance: DBInstance by lazy { DBInstance() }
    }
}