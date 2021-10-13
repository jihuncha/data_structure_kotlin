package com.huni.java.dongbins.chap03_greedy;

import java.util.Scanner;

//3 3
//3 1 2
//4 1 4
//2 2 2

// 2

//2 4
//7 3 1 8
//3 3 3 4
//
//3


public class NumberCardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int result = 0;

        for (int i = 0; i < n; i++) {

            int min_value = 10001;
            for (int j = 0; j < m; j++) {
                int temp = sc.nextInt();
                min_value = Math.min(min_value, temp);
            }

            result = Math.max(result, min_value);
        }

        System.out.println(result);
    }
}
