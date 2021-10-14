package com.huni.java.dongbins.chap04_implementation;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
//                    String hour = String.valueOf(i);
//                    String min = String.valueOf(j);
//                    String sec = String.valueOf(k);
//                    if (hour.contains("3") || min.contains("3") || sec.contains("3")) {
//                        count+=1;
//                    }

                    if (check(i,j,k)) count++;
                }
            }
        }

        System.out.println(count);
    }

    //풀이
    // 특정한 시각 안에 '3'이 포함되어 있는지의 여부
    public static boolean check(int h, int m, int s) {
        if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3)
            return true;
        return false;
    }
}
