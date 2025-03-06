package yourFirstProgramInKotlin

private fun main() {
    addOne(10)
    addOne(11)
    displayHello()
    printFullName("Ycaro","Rodrigues")
    displayHello()
    printFullName("Oscar","Alho")
}

private fun addOne(number: Int) = println(number + 1)

private fun printFullName(firstName: String, lastName: String) = println("$firstName $lastName")

private fun displayHello() = println("Hello")
