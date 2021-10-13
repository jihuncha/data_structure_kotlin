package com.huni.java.dongbins.chap03_greedy;

import java.util.Arrays;
import java.util.Scanner;

//5 8 3
//2 4 5 4 6
public class BigNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(n + " " + m + " " + k);

        int[] myList = new int[n];
        for (int i = 0; i < n; i++) {
            myList[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(myList));

        Arrays.sort(myList);
//        Collections.sort(myList);

        int max_value = myList[n-1];
        int second_max = myList[n-2];

        int result = 0;
        for (int j = 0; j < m; j++) {
            if ((j + 1) % k != 0) {
                result += max_value;
            } else {
                result += second_max;
            }
        }

        System.out.println(result);

    }
}
