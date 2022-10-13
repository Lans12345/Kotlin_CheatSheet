fun main (args : Array<String>) {

    // Finding the factorial of a number using Recursion

    var num = 5 // 1
    var num1 = 4 // 2

    println(fact(num)) // 1

    println(fact(num1)) // 2
}
// 1
// recursion using shortcut function with return statement and if else expression
fun fact (num : Int) : Int = if (num == 0) 1 else num * fact(num - 1)

// 2
fun fact1 (num : Int) : Int { // function with return statement
    if (num == 0)
        return 1
    else
        return num * fact1(num - 1) // Recursion happens in "num * fact1(num - 1)" because we are calling the "fact1" function itself
}
