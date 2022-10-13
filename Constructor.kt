class Constructor (var name : String) { // creating a constructor and passing a variable named "name" with a String value
    // you can remove the keyword "constructor" above if it is default or not using access modifiers
    // you can assign a value in the constructor variable "name" if you want

    init { // this "init" function will always be executed because it is build in constructor to the class
        println("Hello")
    }

    fun sayHello(){ // function
        println("Hello $name") // printing the name passed by the constructor
    }
}

fun main (args : Array<String>) {
    var greet = Constructor("Lance") // creating object and passing a value in the constructor
    greet.sayHello() // calling the "sayHello" function from the "greet" object

}