package createAndUseFunctions

private fun main() {
    // example using name argument
    println(birthdayGreeting(name = "Ycaro", age = 27))
    println("\n")
    println(birthdayGreeting(age = 23, name = "Laura"))
    println("\n")
    println(birthdayGreeting(age = 4))
}

private fun birthdayGreeting (name: String = "Might", age: Int) : String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}