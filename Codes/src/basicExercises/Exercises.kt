package basicExercises


fun main() {
    //Exercise 1
    println(
        "Exercise 1\nUse the val keyword when the value doesn't change. \n" +
                "Use the var keyword when the value can change.\n" +
                "When you define a function, you define the parameters that can be passed to it. \n" +
                "When you call a function, you pass arguments for the parameters."
    )

    //Exercise 2
    println(
        "\n\nExercise 2\n" +
                "New chat message from a friend"
    )

    // Exercise 3
    val discountPercentage = 20
    val item = "Google Chromecast"
    val offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    println("\n\nExercise 3\n$offer")

    // Exercise 4
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("\n\nExercise 4\nThe total party size is: $total")

    //Exercise 5
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("\n\nExercise 5\nCongratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")

    //exercise 6
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 9
    val result = firstNumber + secondNumber
    val otherResult = firstNumber + thirdNumber

    println("\n\nExercise 6\n$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $otherResult")

    //exercise 7
    println("\n\nExercise 7")
    val firstUserEmailId = "user_one@gmail.com"
    println(
        displayAlertMessage(
            emailId = firstUserEmailId
        )
    )

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"
    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"
    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))

    println("\n\nExercise 8")
    val steps = 4000
    val caloriesBurned = pedometerStepsToCalories(steps);
    println("Walking $steps steps burns $caloriesBurned calories")

    println("\n\nExercise 9")
    println(haveYouSpendMoreTimeOnCellphoneTodayOrYesterday(150, 250))
    println(haveYouSpendMoreTimeOnCellphoneTodayOrYesterday(150, 150))
    println(haveYouSpendMoreTimeOnCellphoneTodayOrYesterday(300, 150))

    println("\n\nExercise 10")

    println(citiesWeather("Ankara", 27, 31, 82))
    println(citiesWeather("Tokyo", 32, 36, 10))

}


private fun displayAlertMessage(operationSystem: String? = "Unknown OS", emailId: String): String {
    return "There's a new sign-in request on $operationSystem for your Google Account $emailId"
}

private fun pedometerStepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
    return totalCaloriesBurned
}

private fun haveYouSpendMoreTimeOnCellphoneTodayOrYesterday(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return if (timeSpentToday > timeSpentYesterday) true
        else if (timeSpentToday == timeSpentYesterday) false
        else false
}

private fun citiesWeather(city: String, lowTempeture: Int, highTempeture: Int, chanceOfRain: Int): String{
    return "City: $city\nLow Tempeture: $lowTempeture, High Tempeture: $highTempeture\nChance of Rain: $chanceOfRain%"

}
