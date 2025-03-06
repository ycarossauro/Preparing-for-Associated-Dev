package yourFirstProgramInKotlin

    fun main(){
        val name = "Ycaro"
        greetUser(name)
        println(calculateSum(5, 1))
        println(isEvenOrOdd(5))
        println(checkNumber(0))
        countDown(5)
        greet(name, 26)
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
    Code:
    fun calculateSum(a: Int, b: Int) {
    val sum = a + b
    println("The sum of $a and $b is: $sum")
}*/
    private fun calculateSum(a: Int, b: Int) = a + b

/*
   3. Function with a Return Value
    Modify the function to print "Even" or "Odd" instead of returning a Boolean.
    Code:
    fun isEven(number: Int): Boolean {
    return number % 2 == 0
}
*/

    private fun isEvenOrOdd(number: Int): String {
        return if(number % 2 == 0) "Even" else "Odd"
    }

/*
   4.  Using Kotlin Keywords Correctly
   Modify the function so it returns a string instead of printing it.
   Code:
    fun checkNumber(num: Int) {
    if (num > 0) {
        println("Positive")
    } else if (num < 0) {
        println("Negative")
    } else {
        println("Zero")
    }
}
*/
   private fun checkNumber(num: Int) : String {
        return if (num > 0) {
            "Positive"
        } else if (num < 0) {
            "Negative"
        } else {
        "Zero"
        }
    }
/*
   5. Loop Inside a Function (Statements)
    Modify the function to print "Blast Off!" after the countdown ends.
   Code:
    fun checkNumber(num: Int) {
    if (num > 0) {
        println("Positive")
    } else if (num < 0) {
        println("Negative")
    } else {
        println("Zero")
    }
}
*/
    private fun countDown(n: Int) {
        for (i in n downTo 1) {
            println(i)
            if (i <= 1) println("Blast Off!")
            }
        }

/*
   6. Function with a Default Parameter
    Modify this function to also take an age and print "Hello, Ycaro! You are 25 years old.".
   Code:
   fun greet(name: String = "Guest") {
    println("Hello, $name!")
}
*/

    private fun greet(name: String = "Guest", age: Int? = null) {
        if(age == null) println("Hello, $name!")
        else println("Hello, $name! You are $age years old.")
    }


