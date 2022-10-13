import java.util.Scanner

fun main(args : Array<String>) {

    // same function and syntax to java
    val scan = Scanner(System.`in`)

    println("Enter first number: ")
    var num1 = scan.nextInt()
    println("Enter second number: ")
    var num2 = scan.nextInt()
    var num3 = num1 + num2

    println("The result is $num3")
}