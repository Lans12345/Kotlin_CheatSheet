import java.util.Scanner

fun main(agrs : Array<String>) {
    val scan = Scanner(System.`in`)

    // calculator using if else
    println("Enter first number: ")
    var num1 = scan.nextInt()
    println("Enter second number: ")
    var num2 = scan.nextInt()

    println("Select Operator\n1 = Add\n2 = Subtract\n3 = Multiply\n4 = Divide")
    var op = scan.nextInt()

    var result = if(op == 1) {
        num1 + num2
    } else if(op == 2) {
        num1 - num2
    } else if(op == 3) {
        num1 * num2
    } else if(op == 4) {
        num1 / num2
    } else {
        "Invalid Input"
    }
    println(result)


    // calculator using when statement
    println("Enter first number: ")
    var num3 = scan.nextInt()
    println("Enter second number: ")
    var num4 = scan.nextInt()

    println("Select Operator\n1 = Add\n2 = Subtract\n3 = Multiply\n4 = Divide")
    var op1 = scan.nextInt()

    var output = when(op1) {
        1 -> num3 + num4
        2 -> num3 - num4
        3 -> num3 * num4
        4 -> num3 / num4
        else -> "Invalid Input"
    }
    println(output)


    // calculator using funtion lambda
    println(lans(100,10)) // add
    println(lans1(100,10)) // subtract
    println(lans2(100,10)) // multiply
    println(lans3(100,10)) // divide

}
// lambda
fun lans(a : Int, b : Int) : Int = a + b // add
fun lans1(a : Int, b : Int) : Int = a - b // subtract
fun lans2(a : Int, b : Int) : Int = a * b // multiply
fun lans3(a : Int, b : Int) : Int = a / b // divide

