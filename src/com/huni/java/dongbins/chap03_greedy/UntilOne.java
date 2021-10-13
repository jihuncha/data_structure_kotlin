package com.huni.java.dongbins.chap03_greedy;

import java.util.Scanner;

public class UntilOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int count = 0;

        //몫이 0 이 될떄까지 반복
        while (Math.floorDiv(n,k) != 0) {
            //나머지가 떨어지지 않는 경우 n을 줄이고 다시 반복한다.
            if (Math.floorMod(n,k) != 0) {
                n = n - 1;
                count += 1;
                continue;
            }

            //나누어 떨어질 경우 n 갱신한다.
            n = Math.floorDiv(n,k);
            count += 1;
        }

        //몫이 없는 경우는 나머지가 1 이 아닌 경우 계산을 진행
        if (n != 1) {
            count += n - 1;
        }

        System.out.println(count);
//        int temp = 100001;
//
//        while (temp < k) {
//            temp = (n / k);
//            System.out.println(temp);
//        }

//        System.out.println(n);
    }
}
