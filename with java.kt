// Kotlin can work with Java
fun main(args: Array<String>) {
    // no need to call person.setName & person.getName because Kotlin will automatically call the getters and setters
    var person = java() // creating object of "java" class
    person.name = "Lance" // assigning the name to "Lance" (setters)

    println(person.name) // printing the name (getters)
    person.name = "Andot"
    println(person.name)

}