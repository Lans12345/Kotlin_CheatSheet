// Abstract Class and functions

// ABSTRACT 1
abstract class Car { // abstract class
    abstract fun go() // abstract function
    abstract fun stop() // abstract function

    fun speed() { // we can define function in abstract class
        println("Sprinting. . .")
    }
}
class Lambo : Car() { // normal class inheriting abstract class
    // Must define all the abstract functions in abstract class
    override fun go() { // overriding methods of the abstract class
        println("Starting . . .")
    }
    override fun stop() {  // overriding methods of the abstract class
        println("Stopping . . .")
    }

}


fun main(args : Array<String>) {

    // ABSTRACT 1
    var car1 = Lambo() // object of "Lambo" class and assigning it to the variable "car1"
    car1.speed() // calling the "speed" function in the abstract class
    car1.go() // calling the "go" function


    // ABSTRACT 2
    var shirt = myShirt1() // object of "myShirt1" class
    shirt.design() // calling the "design" function in the abstract class "myShirt" from "myShirt1" normal class
    shirt.size() // calling the abstract function "size" from the "myShirt1" normal class
}

// ABSTRACT 2
abstract class shirt { // abstract class
    abstract fun design() // abstract function
    abstract fun size() // abstract function
}

abstract class myShirt : shirt() { // 2nd abstract class (it must be abstract because we are only defining one abstract class inside this class)
    override fun design() { // overriding "design" abstract function
        println("Anime design")
    }
}

class myShirt1 : myShirt() { // normal class inheriting the "myShirt" abstract class
    override fun size() { // overriding "size" abstract function
        println("Medium")
    }
}






