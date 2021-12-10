package com.huni.java.python.algorithm.stringpr;


//https://leetcode.com/problems/valid-palindrome/
//Input: s = "A man, a plan, a canal: Panama"
//        Output: true
//        Explanation: "amanaplanacanalpanama" is a palindrome.

//Input: s = "race a car"
//        Output: false
//        Explanation: "raceacar" is not a palindrome.

//Input: s = " "
//        Output: true
//        Explanation: s is an empty string "" after removing non-alphanumeric characters.
//        Since an empty string reads the same forward and backward, it is a palindrome.

//Constraints:
//
//        1 <= s.length <= 2 * 105
//        s consists only of printable ASCII characters.

public class ValidPalindrome {

    public static void main(String[] args) {
        String s =  "A man, a plan, a canal: Panama";
        s = "race a car";
        s = " ";

//        System.out.println(isPalindrome(s));

        boolean result = isPalindrome(s);
        System.out.println(result);
    }


    public static boolean isPalindrome(String s) {
        if (s.isBlank()) {
            return true;
        }

        s = s.toLowerCase();
        //소문자영어와 숫자만 남긴다.
        s = s.replaceAll("[^a-z0-9]","");
//        System.out.println(s);

        int start = 0;
        int end = s.length() - 1;

        for (int i = 0; i < s.length(); i++) {
            if (start >= end) {
                return true;
            }

            System.out.println(s.charAt(start) + " - " + s.charAt(end));
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            } else {
                start += 1;
                end -= 1;
            }
        }

        return true;
    }
}

