
fun main(args : Array<String>) {
    var num1 : String = "5"
    var num2 : Int = 4
    println(num1.toInt() + num2) // .toInt function to convert any String to Integer

    var name : String = "LANCE"
    var n1 : String = name.toLowerCase() // .toLowerCase function to make the String all lowercase
    println(n1)

    if (n1.contains("lance")) // using .contains function
        println("naa")
    else
        println("wala")
}