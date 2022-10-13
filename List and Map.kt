import java.util.* // need to import to use hashmap

fun main (args: Array<String>) {

    // EXAMPLE 1
    var nums =listOf(5,10,15,20,25) // list
    for (i in nums){
        println(i)
    }

    // EXAMPLE 2
    var num =listOf(5,10,15,20,25) // list
    for ((i,e) in num.withIndex()){ // using withIndex() method to store the index numbers of the numbers in array to the variable "e"
        println("$i : $e") // using dollar sign to use variable
    }

    // EXAMPLE 3 (HASHMAP)
    var students = TreeMap<String, Int>() // hashmap
    students["Lance"] = 19 // values = keys
    students["Dominic"] = 20 // values = keys
    students["Algen"] = 18 // values = keys

    println(students.values) // printing all the values in ascending order
    println(students.keys) // printing all the keys in ascending order

    // printing the values and keys using for loop in ascending order
    for ((name, age) in students){ // putting the values to the "name" variable and putting keys to the "age variable"
        println("$name = $age") // printing using dollar sign in ascending order
    }

}