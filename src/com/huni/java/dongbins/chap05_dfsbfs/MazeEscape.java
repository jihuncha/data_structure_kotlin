package com.huni.java.dongbins.chap05_dfsbfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



/*
5 6
101010
111111
000001
111111
111111
* */
public class MazeEscape {

    public static int n, m;
    public static int[][] graph = new int[201][201];

    public static int dx[] = {-1,1,0,0};
    public static int dy[] = {0,0,-1,1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String text = sc.nextLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = text.charAt(j) - '0';
            }
        }
//        System.out.println(Arrays.deepToString(graph));

        System.out.println(bfs(0,0));
    }

    public static int bfs(int x, int y) {
        Queue<NodeEscape> myQueue = new LinkedList<>();
        myQueue.offer(new NodeEscape(x,y));

        while(!myQueue.isEmpty()) {
            NodeEscape node = myQueue.poll();
            x = node.getX();
            y = node.getY();

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                    continue;
                }

                if (graph[nx][ny] == 0) {
                    continue;
                }

                if (graph[nx][ny] == 1) {
                    graph[nx][ny] = graph[x][y] + 1;
                    myQueue.offer(new NodeEscape(nx, ny));
                }
            }
        }

        return graph[n-1][m-1];

    }
}

class NodeEscape {
    private int x;
    private int y;

    NodeEscape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}