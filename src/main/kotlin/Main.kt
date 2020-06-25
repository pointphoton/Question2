

    fun main() {
        val str = "neveroddoreven"
        println("result 1 ${isAnagramOfPalindrome(str,"dooernedeevrvn")}")
        println("result 2 ${isAnagramOfPalindrome(str,"aabcba")}")
    }

    fun isAnagramOfPalindrome(palindrome: String, input: String): Boolean {
        if (palindrome.length != input.length) return false
        val characters = IntArray(26)
        for (i in palindrome.indices)
            characters[palindrome[i] - 'a']++
        for (i in input.indices)
            characters[input[i] - 'a']--
        for (c in characters) {
            if (c != 0) return false
        }
        return true
    }
