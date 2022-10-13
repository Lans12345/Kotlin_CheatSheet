


data class person(var name : String, var age : Int) // data class

fun main(args : Array<String>) {

    var p1 = listOf<person>(person("Lance", 19), person("Dominic", 20)) // list of objects and passing a value

    for(i in p1) {
        println(i) // printing all the values in the list
        println(i.name) // printing the "name" value in the list
        println(i.age) // printing the "age" value in the list
    }

}