package com.huni.practice.backjoon.dfsbfs;

//https://www.acmicpc.net/problem/18352


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ProblemOne {

    public static int n,m,k,x;
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        x = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for (int j = 0; j < m; j++) {
            String text = sc.nextLine();

//            System.out.println(text);

            int from = (int)text.charAt(0) - '0';
            int to = (int)text.charAt(2) - '0';

//            System.out.println((int)text.charAt(0) - '0');

            graph.get(from).add(to);
//            graph.get(j).add()
        }

//        System.out.println(graph.get(3).toString());



//        for (int i = 0; i < m; i++) {
//            graph.add(new ArrayList<Node>());
////            String text = sc.nextLine();
//            graph.get(i).add(new Node(sc.nextInt(), sc.nextInt()));
//            sc.nextLine();
//        }
//
//        // 그래프 출력
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < graph.get(i).size(); j++) {
//                graph.get(i).get(j).show();
//            }
//            System.out.println();
//        }
    }
}
//
//class Node {
//    private int index;
//    private int distance;
//
//    public Node(int index, int distance) {
//        this.index = index;
//        this.distance = distance;
//    }
//
//    public void show() {
//        System.out.print("(" + this.index + "," + this.distance + ") ");
//    }
//}
