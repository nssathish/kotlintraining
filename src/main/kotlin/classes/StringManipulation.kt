package classes

class StringManipulation {
    fun longestSubsequence(input: String): String {
        // aaaabbbbbbaacccddddddddddddddbbb
        var length = 0
        var maxLength = 0
        var longestSequenceBuilder: StringBuilder = StringBuilder()
        var longestSequence = ""
        var ch = Char.MIN_VALUE

        if (input.length == 1) return input

        input.forEach {
            if (it == ch) {
                length++
                longestSequenceBuilder.append(ch.toString())
            }
            else {
                if (length > maxLength) {
                    maxLength = length
                    longestSequence = longestSequenceBuilder.toString()
                }
                length = 1
                longestSequenceBuilder = StringBuilder()
            }
            ch = it
        }
        return longestSequence.ifEmpty { input }
    }
}