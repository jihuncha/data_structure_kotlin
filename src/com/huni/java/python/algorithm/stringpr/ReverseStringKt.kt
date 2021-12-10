package com.huni.java.python.algorithm.stringpr

class ReverseStringKt {
    fun reverseString(s: CharArray): Unit {
        println(s.lastIndex)
        println(s.size)
        for (index in 0..s.lastIndex / 2) {
            var temp = s[index]
            s[index] = s[s.size - index -1]
            s[s.size - index -1] = temp
        }

        println(s)
    }
}

fun main() {
    val test = charArrayOf('h', 'e', 'l', 'l', 'o')
    ReverseStringKt().reverseString(test)
}

//Input
//["A"," ","m","a","n",","," ","a"," ","p","l","a","n",","," ","a"," ","c","a","n","a","l",":"," ","P","a","n","a","m","a"]
//Output
//["a","m","a","n","a","P"," ",":","l","a","n","a","c"," "," ","a",",","n","a","l","p"," ","a"," ",",","n","a","m"," ","A"]
//Expected
//["a","m","a","n","a","P"," ",":","l","a","n","a","c"," ","a"," ",",","n","a","l","p"," ","a"," ",",","n","a","m"," ","A"]