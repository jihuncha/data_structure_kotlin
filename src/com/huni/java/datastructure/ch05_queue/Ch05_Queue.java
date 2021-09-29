package com.huni.java.datastructure.ch05_queue;

import java.util.ArrayList;

public class Ch05_Queue {
//    연습해보기
//
//- JAVA ArrayList 클래스를 활용해서 큐를 다루는 enqueue, dequeue 기능 구현해보기
//- dequeue 기능 호출 시, 큐에 데이터가 없을 경우, null 을 리턴하도록 함
//- 다양한 데이터 타입을 다룰 수 있도록, Java Genric 타입 문법을 활용해보기

    public void main(String[] args) {
        MyQueue<Integer> mq = new MyQueue<Integer>();
        mq.enqueue(1);
        mq.enqueue(2);
        mq.enqueue(3);
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
    }

    public class MyQueue<T> {
        private ArrayList<T> data = new ArrayList<T>();

        public void enqueue(T item) {
            if (data != null) {
                data.add(item);
            } else {
                data = new ArrayList<T>();
                data.add(item);
            }
        }

        public T dequeue() {
            if (data != null) {
                return data.remove(0);
            } else {
                return null;
            }
        }

        public boolean isEmpty() {
            return data.isEmpty();
        }
    }
}




