fun main(args : Array<String>) {

    // ARRAY 1 - defined array(int)
    var nums = intArrayOf(5,10,15,20,25) // array

    println(nums[0]) // printing the value of the index "0"
    for (i in nums) { // printing all the values of the array
        println(i)
    }


    // ARRAY 2 - undefined array(int)
    var num = IntArray(5)
    num.set(0,5) // (index, value)
    num.set(1,10) // (index, value)
    num.set(2,15) // (index, value)
    num.set(3,20) // (index, value)
    num.set(4,25) // (index, value)

    for (i in num) { // printing the values of the array "num"
        println(i)
    }


    // ARRAY 3 - STRING
    var names = arrayOfNulls<String>(5) // array of Strings
    names.set(0,"Lance") // (index, value)
    names.set(1,"Algen") // (index, value)
    names.set(2,"Dominic") // (index, value)
    names.set(3,"Bret") // (index, value)
    names.set(4,"Normel") // (index, value)

    for (i in names) { // printing the values of the array "names"
        println(i)
    }
}