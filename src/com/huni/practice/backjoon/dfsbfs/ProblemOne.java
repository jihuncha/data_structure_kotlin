package com.huni.practice.backjoon.dfsbfs;

//https://www.acmicpc.net/problem/18352


import java.util.ArrayList;
import java.util.Scanner;

public class ProblemOne {

    public static int n,m,k,x;
    public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        x = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < m; i++) {
            graph.add(new ArrayList<Node>());
//            String text = sc.nextLine();
            graph.get(i).add(new Node(sc.nextInt(), sc.nextInt()));
            sc.nextLine();
        }

        // 그래프 출력
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < graph.get(i).size(); j++) {
                graph.get(i).get(j).show();
            }
            System.out.println();
        }
    }
}

class Node {
    private int index;
    private int distance;

    public Node(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    public void show() {
        System.out.print("(" + this.index + "," + this.distance + ") ");
    }
}
