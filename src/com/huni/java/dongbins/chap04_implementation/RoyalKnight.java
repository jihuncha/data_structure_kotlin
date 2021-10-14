package com.huni.java.dongbins.chap04_implementation;

import java.util.Scanner;


//a1

//2


public class RoyalKnight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String start = sc.nextLine();

        int row = start.charAt(1) - '0';
        int column = start.charAt(0) - 'a' + 1;

//        System.out.println(row + " - " +column);

        int[] dx = {1, 1, -1, -1, 2, 2, -2, -2};
        int[] dy = {2, -2, 2, -2, 1, -1, 1, -1};

        int result = 0;

        for (int i = 0; i < 8; i++) {
            int nx = dx[i] +  row;
            int ny = dy[i] + column;

            if (nx < 1 || ny < 1 || nx > 8 || ny > 8) {
                continue;
            }

            result +=1;
        }

        System.out.println(result);

    }
}
