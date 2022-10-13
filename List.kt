

fun main(args : Array<String>) {

    // List 1 - Ready only List(Fixed)

    var nums = listOf<Int>(5,10,15,20) // read only list of int

    println(nums.get(0)) // getting the first element
    println(nums) // printing all the values
    for (i in nums) { // printing all the values using for loop to remove the brackets
        println(i)
    }

    // List 2 - Mutable List

    var names = mutableListOf<String>("Lance", "Doms", "Bret") // mutable list of Strings

    println(names) // printing all the values
    for (i in names) { // printing all the values using for loop to remove the brackets
        println(i)
    }

    names.add("Algen") // adding a value to the List
    println(names)

    names.add(0, "Lineth") // adding a value to the List to a certain index
    println(names)

    names.remove("Lance") // removing a value in the List
    println(names)




    // Basic list of strings
    var person = listOf<String>("Andot", "Langlang") // read only list of int
    for (i in person) { // printing all the values using for loop to remove the brackets
        println(i)
    }


    // Using forEach concept
    var n = listOf<Int>(5,10,12,16,22) // list on integers
    n.forEach({println(it)}) // calling all the values in the list because of forEach function


}
