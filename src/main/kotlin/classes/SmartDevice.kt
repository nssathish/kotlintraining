package classes

class SmartDevice (name: String, category: String) {
    var  deviceStatus = "online"

    constructor(name: String, category: String, statusCode: Int) : this(name,category) {
        deviceStatus = when(statusCode) {
            0 -> "Offline"
            1 -> "Online"
            else -> "Unknown"
        }
    }

    var speakerVolume = 2
        get() = field
        set(value) {
            if (value in 1..100)
                field = value
        }

    fun turnOn() {
        println("The smart device is turned on")
    }
    fun turnOff() {
        println("The smart device is turned off")
    }
}