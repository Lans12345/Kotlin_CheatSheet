// Inheritance and Overriding functions
open class phone {
    open fun sendMessage(){
        println("Sending messages")
    }
}

open class computers : phone() { // Inheriting the "phone" class and now can use the "sendMessage" function
    fun compute() {
        println("Computing")
    }

    // OVERRIDING FUNCTION
    override fun sendMessage() { // overriding the "sendMessage" function in the "phone" class
        println("Sending message through Computer")
        super.sendMessage() // we are able to call the "sendMessage" function from the "phone" class
    }

}
fun main (args : Array<String>) {
    var iphone = computers() // creating the object of "iphone" from "computers" class
    iphone.sendMessage() // calling the "sendMessage" function from the "computers" class
    // the "sendMessage" function in "computers" class will be called because our object is base from the "computers"

    // Output
    // Sending message through Computer - from "computer" class
    //Sending messages - from "phone" class (it is being called because we put "super.sendMessage")

}
