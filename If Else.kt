
fun main(args: Array<String>){
    // NORMAL IF ELSE
    var num1 : Int = 10
    var num2: Int = 20
    if (num1 > num2)
        println("Num1 is bigger")
    else
        println("Num2 is bigger")

    // If Else that can store an expression into a variable
    var num3 : Int = 20
    var num4: Int = 10
    var num5 : Int = 0

    num5 = if (num3 > num4) // assigning num5 to expression If Else
        num3 // returned value
    else
        num4 // returned value
    println(num5) // printing the bigger number


    // String Comparison
    // Example 1
    var n1 : String = "Andot"
    var n2 : String = "Andot"

    if (n1.equals(n2)) // using .equals method do not ignore lower/upper cases
        println("Same")
    else
        println("Not Same")
    // output = Same


    // Example 2
    var name1 : String = "Andot"
    var name2 : String = "andot"

    if (name1.equals(name2, true)) // using .equals method that ignores lower cases because we added ",true"
        println("Same")
    else
        println("Not Same")
    // output = Same


    // Example 3
    var n3 : String = "Andot"
    var n4 : String = "andot"

    if (n3 == n4) // using "==", do not ignores cases
        println("Same")
    else
        println("Not Same")
    // output = Not Same


    // If Else Example with Expression
    var n5 : Int = 5
    var n6 : Int = 6

    var num = if (n5 > n6) // Expression to store the returned value of the Statement into the "num" variable
        "First Number" // returned value if the statement of if is true
    else
        "Second Number" // returned value if the statement of if is false

    println(num)

}