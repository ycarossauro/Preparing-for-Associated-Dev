package createAndUseVariables

fun main() {

    notificationEnabled()
//    println("Say \"hello\"")
}

//Int
private fun numberOfPhotos( ){
    val numberOfPhotos = 100
    val numberOfPhotosDeleted = 10
    println("$numberOfPhotos photos")
    println("$numberOfPhotosDeleted photos deleted")
    println("${numberOfPhotos -  numberOfPhotosDeleted} photos left")
}

private fun shoppingCart(){
    var cartTotal = 0
    cartTotal = 20
    println("Total: $cartTotal")
}

/*
 * This program displays the number of messages
 * in the user's inbox.
 */
private fun unreadMessagems(){
    // Create a variable for the number of unread messages.
    var count = 10
    count++
    println("You have $count unread messages.")
    // Decrease the number of messages by 1.
    count--
    println("You have $count unread messages.")
}

// Double
private fun myTrip(){
    val trip1 = 3.20
    val trip2= 4.10
    val trip3= 1.72
    val totalTripLength = trip1 + trip2 + trip3
    println("$totalTripLength miles left to destination")
}

//String

private fun nextMeeting(){
    val nextMeeting = "Next meeting: "
    val date = "January 1"
    val reminder = "$nextMeeting$date at work"
    println(reminder)
}

/*
 *  This program print a message with the status
 *  of notifications is enabled
 */
//Boolean
private fun notificationEnabled(){
    val notificationsEnabled = false
    println("Are notifications enabled? $notificationsEnabled")
}
