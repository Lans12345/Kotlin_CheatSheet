fun main (args : Array<String>) {
    var num1 : Int = 0
    var num2 : Int = 1

    try {
        println(num2 / num1)
    } catch ( e : Exception) { // executed if an exception occur
        println("ERROR")
    } finally { // this block will be executed all the time
        println("Bye")
    }
}