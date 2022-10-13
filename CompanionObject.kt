
// Companion Object allows you to call a function inside it by <class name>.<funciton name>
class A {
    companion object { // companion object
        fun show() { // function inside the companion object
            println("Hello World!")
        }
    }
}

fun main (args : Array<String>) {
    A.show() // calling the "show" function by <class name>.<funciton name>
}
