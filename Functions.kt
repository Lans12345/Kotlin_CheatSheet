
fun main(args : Array<String>) {
    // FUNCTION 1
    mul(10,5) // calling the "mul" function and passing a value

    // FUNCTION 2
    var result = multiply(10,10) // assigning the multiply function to the "result" variable
    println(result) // printing the "result" variable

    // FUNCTION 3
    var addition = add(100,200) // assigning the add function to the "addition" variable
    println(addition) // printing the "addition" variable

    // FUNCTION 4
    var m = max(300,500) // assigning the max function to the "m" variable
    println(m) // printing the "m" variable

    // FUNCTION 5
    // normal functions, does not a parameter and does not return a value
    hello() // calling the function "hello"

}
// FUNCTION 1
fun mul(a : Int, b : Int) { // functions that multiplies number
    println(a * b)
}
// FUNCTION 2
fun multiply(a : Int, b : Int) : Int { // return type function
    return a * b // return the value
}
// FUNCTION 3
fun add(a : Int, b : Int) : Int = a + b // shortcut of a function that returns a value

// FUNCTION 4
fun max(a : Int, b : Int) : Int = if(a > b) a else b // shortcut function with if else statement

// FUNCTION 5
fun hello(){
    for (i in 1..5) {
        println("HELLO WORLD!") // printing the "HELLO WORLD!" 5 times
    }

}
