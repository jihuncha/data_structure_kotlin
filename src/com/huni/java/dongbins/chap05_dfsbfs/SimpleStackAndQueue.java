package com.huni.java.dongbins.chap05_dfsbfs;

import java.util.*;

public class SimpleStackAndQueue {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();

        myStack.push(1);
        myStack.add(2);
        myStack.add(34);
        myStack.add(2233);

        System.out.println(myStack);

        myStack.pop();
//        myStack.remo
        myStack.removeElementAt(2);
        System.out.println(myStack);
/////////////////////////////////////////////////
        Queue<Integer> myQueue = new LinkedList<>();

        myQueue.offer(10);
        myQueue.offer(20);
        myQueue.offer(30);
        myQueue.offer(40);


        System.out.println(myQueue);

        myQueue.poll();
        myQueue.remove();

        System.out.println(myQueue);
//////////////////////////////////////////////////
        System.out.println("mine - stack");

        MyOriginStack<Integer> test_one = new MyOriginStack<>();

        test_one.push(1);
        test_one.push(2);
        test_one.push(34);
        test_one.push(2233);

        test_one.printAll();

        test_one.pop();

        test_one.printAll();

        //////////////////////////////////////////////////
        System.out.println("mine - stack");

        MyOriginQueue<Integer> test_two = new MyOriginQueue<>();

        test_two.enqueue(10);
        test_two.enqueue(20);
        test_two.enqueue(30);
        test_two.enqueue(40);

        test_two.printAll();

        test_two.dequeue();
        test_two.dequeue();

        test_two.printAll();

    }

    public static class MyOriginStack<T> {
        private List<T> dataList = new ArrayList<T>();

        public void push(T data) {
            if (dataList == null) {
                dataList = new ArrayList<T>();
                dataList.add(data);
            } else {
                dataList.add(data);
            }
        }

        public T pop() {
            if (!dataList.isEmpty()) {
                return dataList.remove(dataList.size() - 1);
            }
            return null;
        }

        public void printAll() {
            if (!dataList.isEmpty()) {
                for (int i = 0; i < dataList.size(); i++) {
                    System.out.print(dataList.get(i) + " ");
                }
                System.out.println();
            }
        }
    }

    public static class MyOriginQueue<T> {
        private List<T> dataList = new ArrayList<T>();

        public void enqueue(T data) {
            if (dataList == null) {
                dataList = new ArrayList<T>();
                dataList.add(data);
            } else {
                dataList.add(data);
            }
        }

        public T dequeue() {
            if (!dataList.isEmpty()) {
                return dataList.remove(0);
            }
            return null;
        }

        public void printAll() {
            if (!dataList.isEmpty()) {
                for (int i = 0; i < dataList.size(); i++) {
                    System.out.print(dataList.get(i) + " ");
                }
                System.out.println();
            }
        }
    }
}
