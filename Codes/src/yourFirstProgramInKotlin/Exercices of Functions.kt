package yourFirstProgramInKotlin

    fun main(){
        greetUser("Ycaro")
        println(calculateSum(5, 1))
        println(isEvenOrOdd(5))
    }


/*
   1. Define a Simple Function
    Modify the function so it prints a personalized greeting using an input (e.g., "Hello, Ycaro!").
    Code:
    fun greetUser() {
    println("Hello, Kotlin!")
}
 */
    private fun greetUser(name: String) {
        println("Hello, $name!")
    }

/*
   2. Function with Inputs (Parameters)
    Modify this function so it returns the sum instead of printing it.
    fun calculateSum(a: Int, b: Int) {
    val sum = a + b
    println("The sum of $a and $b is: $sum")
}*/
    private fun calculateSum(a: Int, b: Int) = a + b

/*
   3. Function with a Return Value
    Modify the function to print "Even" or "Odd" instead of returning a Boolean.
    fun isEven(number: Int): Boolean {
    return number % 2 == 0
}
*/

    private fun isEvenOrOdd(number: Int): String {
        return if(number % 2 == 0) "Even" else "Odd"
    }

/*
   3. Function with a Return Value
    Modify the function to print "Even" or "Odd" instead of returning a Boolean.
    fun isEven(number: Int): Boolean {
    return number % 2 == 0
}
*/
   private fun checkNumber(num: Int) {
        if (num > 0) {
            println("Positive")
        } else if (num < 0) {
            println("Negative")
        } else {
        println("Zero")
        }
    }


