package com.huni.java.datastructure.ch05_queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_test {

    public static void main(String[] args) {
        Queue<Integer> queue_int = new LinkedList<Integer>();
        Queue<String> queue_str = new LinkedList<String>();

        queue_int.add(1);
        queue_int.offer(2);

        System.out.println(queue_int);

        queue_int.poll();

        System.out.println(queue_int);

        queue_int.remove();

        System.out.println(queue_int);
    }



}
