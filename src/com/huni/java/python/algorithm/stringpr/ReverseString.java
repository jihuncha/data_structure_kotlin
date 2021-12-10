package com.huni.java.python.algorithm.stringpr;

//https://leetcode.com/problems/reverse-string/

//Write a function that reverses a string. The input string is given as an array of characters s.

//You must do this by modifying the input array in-place with O(1) extra memory.

//Example 1:
//
//        Input: s = ["h","e","l","l","o"]
//        Output: ["o","l","l","e","h"]
//Example 2:
//
//        Input: s = ["H","a","n","n","a","h"]
//        Output: ["h","a","n","n","a","H"]

import java.util.Arrays;
import java.util.Stack;

public class ReverseString {
    public static void reverseString(char[] s) {
//        char[] result = new char[s.length];
//
//        for (int i = 0; i < s.length; i++) {
//            result[i] = s[s.length -1 -i];
//        }

        for (int i = 0; i < s.length/2; i++) {
            char temp = s[i];
            s[i] = s[s.length -i -1];
            s[s.length -i -1] = temp;
        }

        System.out.println(Arrays.toString(s));

    }

    public static void main(String[] args) {
//        char[] myList = {'h','e','l','l','o'};
        char[] myList = {'h','a','n','n','a','H'};
//        System.out.print(myList);

        reverseString(myList);

//        System.out.println();

    }
}
