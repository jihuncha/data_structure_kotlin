package com.huni.java.python.algorithm.stringpr

class ValidPalindromekt {
    fun isPalindrome(s: String): Boolean {
        val temp = s.toLowerCase().filter { (it.isLetterOrDigit()) }

        for (i in temp.indices) {
            if (temp[i] != temp[temp.length - i - 1]) {
                return false
            }
        }

        return true
    }
}
//s = "race a car"
fun main() {
//    val test = ValidPalindromekt().isPalindrome("A man, a plan, a canal: Panama")
//    val test = ValidPalindromekt().isPalindrome("  ")
    val test= ValidPalindromekt().isPalindrome("race a car")
    println(test)

}