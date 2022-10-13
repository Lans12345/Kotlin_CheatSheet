fun main (args : Array<String>){
    // EXAMPLE 1
    var num = 1..10 // range

    for(i in num.reversed()) { // for loop - just like in python, putting all the range values of variable num into the variable i
        println(i) // printing the values of i
    }
    // output - 1,2,3,4,5,6,7,8,9,10


    // EXAMPLE 2
    var nums = 1..10 // range

    for(i in nums step 2) { // for loop - just like in python, putting all the range values of variable num into the variable i by adding 2 because we put "step 2"
        println(i) // printing the values of i
    }
    // output - 1,3,5,7,9


    // EXAMPLE 3
    var a = 10 downTo 1 //"downTo" keyword -  to make a range from 10 to 1 (descending order)

    for(i in a){
        println(i)
    }
    // output - 10,9,8,7,6,5,4,3,2,1


    // EXAMPLE 4
    var b = 1..10 // range

    for(i in b.reversed()) { //  printing the values of variable "b" into reversed order
        println(i) // printing the values of i
    }
    // output - 10,9,8,7,6,5,4,3,2,1


    // EXAMPLE 5
    var x = 1 until 10 //"until" keyword -  to make a range from 1 to 9 (not including 10)

    for(i in x){
        println(i)
    }
    // output - 1,2,3,4,5,6,7,8,9


    // EXAMPLE 6
    var letters = 'A'..'z' // Capital A TO Z and Lowercase a to z (all)
    for(i in letters){
        println(i)
    }
    // output - Capital A TO Z and Lowercase a to z (all)


    // EXAMPLE 7
    var l = 'A'..'Z' // Capital A TO Z
    for(i in l){
        println(i)
    }
    // output - Capital A TO Z


    // EXAMPLE 8
    var c = 'a'..'z' // Lowercase a TO z
    for(i in c){
        println(i)
    }
    // output - Lowercase a TO z


    // EXAMPLE 9
    var co = 1..100
    println(co.count()) // "count()" to count how many numbers is in the range
    // output - 100


    // EXAMPLE 10
    for(i in 1..5) {
        println("Hello World")
    }
    // output - printing "Hello World" 5 times
}