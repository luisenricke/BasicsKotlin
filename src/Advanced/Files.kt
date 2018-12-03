package Advanced

import java.io.FileReader
import java.io.FileWriter

fun main(args: Array<String>) {

    /*println("Please enter a text: ")
    var input = readLine().toString()
    writeExternalFile(input)
    */
    readExternalFile()
}

fun writeExternalFile(content: String) {
    try {
        var fileWriter: FileWriter = FileWriter("ExternalFile.txt")
        fileWriter.write(content)
        fileWriter.close()
        println("The text is saved")
    } catch (ex: Exception) {
        println(ex.message)
    }
}

fun readExternalFile() {
    try {
        var fileReader: FileReader = FileReader("ExternalFile.txt")
        var counter: Int?
        do {
            counter = fileReader.read()
            print(counter.toChar())
        } while (counter != -1)
    } catch (ex: Exception) {
        println(ex.message)
    }
}