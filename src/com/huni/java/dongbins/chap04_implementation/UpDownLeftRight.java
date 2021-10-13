package com.huni.java.dongbins.chap04_implementation;

import java.util.Arrays;
import java.util.Scanner;

public class UpDownLeftRight {

//5
//R R R U D D
//
//3 4

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //버퍼 비우기
        sc.nextLine();

        String[] lines = sc.nextLine().split(" ");
        int x = 1, y = 1;

        System.out.println(Arrays.toString(lines));

        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};
        char[] moveTypes = {'D','R','U','L'};

        for (int i = 0; i < lines.length; i++) {
            char plan = lines[i].charAt(0);

            int nx = 1, ny = -1;
            for (int j = 0; j < 4; j++) {
                if (plan == moveTypes[j]) {
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }

            if (nx < 1 || ny < 1 || nx > n || ny > n) {
                continue;
            }

            x = nx;
            y = ny;
        }

        System.out.println(x + " " + y);
    }
}
