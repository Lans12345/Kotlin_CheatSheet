fun main (args : Array<String>) {
    var person1 = FunctionExtension2() // creating object of "FunctionExtension2" class

    person1.language = "Python" // assigning the value
    person1.show() // printing show function in "FunctionExtension2" class

    var person2 = FunctionExtension2() // creating object of "FunctionExtension2" class

    person2.language = "Java" // assigning the value
    person2.show() // printing show function in "FunctionExtension2" class
}