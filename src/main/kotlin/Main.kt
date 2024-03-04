import classes.SmartDevice
import classes.StringManipulation

fun main() {
    println("Hello World!")

    var txt = "name"
    txt = "something"

    val trip1 = 3.20
    val trip2 = 4.10
    val trip3 = 1.72
    val totalTripLength = 0.0

    println("trip1 costs $trip1")
    println("trip2 costs $trip2")
    println("total trip costs $totalTripLength")
    println(StringManipulation().longestSubsequence("aaaabbbbbbaacccddddddddddddddbbb"))
    println(StringManipulation().longestSubsequence("aaaa"))

    val device = SmartDevice("Android TV", "Entertainment")
//    println("""
//        Device name: ${device.name}
//        Device Category: ${device.category}
//        Device status: ${device.deviceStatus}
//    """.trimIndent())
//    device.speakerVolume = 100

    println("Speaker volume now: ${device.speakerVolume}")
    device.turnOn()
    device.turnOff()
}