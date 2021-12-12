package com.huni.test.tmon;

//무한히 큰 배열에 다음과 같이 분수들이 적혀있다.
//
//        1/1  1/2  1/3  1/4  1/5  ...
//        2/1  2/2  2/3  3/4  ...  ...
//        3/1  3/2  3/3  ...  ...  ...
//        4/1  4/2  ...  ...  ...  ...
//        5/1  ...  ...  ...  ...  ...
//        ...  ...  ...  ...  ...  ...
//
//        이와 같이 나열된 분수들을 1/1 -> 1/2 -> 2/1 ->3/1 -> 2/2-> 3/1 -> ...과 같은
//        지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번이라고 하자.
//
//        X가 주어졌을때 X번째 분수를 구하는 프로그램을 작성하시오.
//        (X는 1보다 크고 10,000,000보다 작다.)
//
//        참고로 X가 4인 경우에 3/1을 리턴한다.

//4

import java.util.Scanner;

public class TmonTestTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int findNumber = sc.nextInt();

        System.out.println(findNumber);

        int resultX = 1;
        int resultY = 1;

        while (findNumber != 0) {
            System.out.println(resultX + " - " + resultY);
            if (resultX == 1 && resultY == 1) {
                resultY += 1;
                findNumber -= 1;
                continue;
            } else if (resultX == 1) {
                resultX += 1;
                resultY -= 1;
                findNumber -= 1;
                continue;
            } else if (resultY == 1) {
                resultX += 1;
                findNumber -= 1;
                continue;
            } else {
                resultY += 1;
                resultX -= 1;
                findNumber -= 1;
                continue;
            }
        }


        System.out.println(resultX + "-" + resultY);
    }
}
