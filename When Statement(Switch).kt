
fun main(args : Array<String>){
    val num : Int = 3

    // Switch Statement (Int)
    when(num){
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        else -> println("Invalid") // default if none of the choices is in the statement
    }
    val num1 : String = "one"

    // Switch Statement (String)
    when(num1){
        "one" -> println("1")
        "two" -> println("2")
        "three" -> println("3")
        else -> println("Invalid") // default if none of the choices is in the statement
    }

    // Switch Statement as Expression
    val age : Int = 9

    var string = when(age){ // returning the value of when statement and putting it in "string" variable
        5 -> "Five"
        6 -> "Six"
        7 -> "Seven"
        else -> "Invalid Input" // default if none of the choices is in the statement
    }
    println("The answer is " + string)
}