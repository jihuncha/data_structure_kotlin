package com.huni.java.dongbins.chap05_dfsbfs;

public class Factorial {
    public static int factorialIterative(int n) {
        int result = 1;

        for (int i = 2; i < n+1; i++) {
            result *= i;
        }

        return result;
    }

    public static int factorialRecursive(int n) {
        if (n == 1) return 1;

        return factorialIterative(n - 1) * n;
    }

    public static void main(String[] args) {
        System.out.println(factorialIterative(5));

        System.out.println(factorialRecursive(5));
    }
}
