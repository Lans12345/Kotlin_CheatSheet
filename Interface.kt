// Interface


// Interface Example 1
interface phone1 { // interface class
    fun call() // abstract function inside this interface
    fun message() // abstract function inside this interface
}

// when inheriting an interface class, all of the functions must be define
class iPhone : phone1 { // normal class inheriting the "phone1" interface class
    override fun call() { // overriding the "call" abstract function in the interface class
        println("Calling")
    }
    override fun message() { // overriding the "message" abstract function in the interface class
        println("Sending Messages")
    }
}

fun main(args : Array<String>) {

    // Interface Example 1
    var phone1 = iPhone()
    phone1.call()
    phone1.message()

    // Interface Example 2
    var plane1 = plane()
    plane1.launch()
    plane1.fly()
}

// Interface Example 2
// Inheriting a 2 Interface class
interface rocket { // interface 1
    fun launch() // abstract class
}

interface spaceship { // interface 2
    fun fly() // abstract class
}

// when inheriting an interface class, all of the functions must be define
// we can inherit one or more interface class
class plane : rocket, spaceship { // normal class inheriting the "rocket" and "spaceship" interface class
    override fun launch() { // overriding the "launch" abstract functio from the "rocket" interface class
        println("Launching") // overriding the "fly" abstract function from the "spaceship" interface class
    }
    override fun fly() {
        println("Flying")
    }
}


