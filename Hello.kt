
fun main(args: Array<String>) {
    println("Hello")

    // var - stands for variable
    // val - constant, values cannot be changed or reassigned
    var myName = Variables() // Creating Reference to the class "Variable"

    println(myName.name) // Printing name in "Variable" class
    println(myName.age) // Printing age in "Variable" class

    myName.name = "Andot" // Assigning new value to the name
    println("Hi, my name is " + myName.name) // Printing the new name
}


