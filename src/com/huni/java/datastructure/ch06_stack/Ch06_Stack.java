package com.huni.java.datastructure.ch06_stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Ch06_Stack {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<Integer>();

        myStack.add(1);
        myStack.add(2);
        myStack.add(3);

        myStack.pop();

        System.out.println(myStack);

        MyStack<Integer> ms = new MyStack<Integer>();
        ms.push(1);
        ms.push(2);
        System.out.println(ms.pop());
        ms.push(3);
        System.out.println(ms.pop());
        System.out.println(ms.pop());
//        System.out.println(ms.pop());         //null
    }

//    연습해보기
//
//- JAVA ArrayList 클래스를 활용해서 스택을 다루는 push, pop 기능 구현해보기
//- pop 기능 호출 시, 스택에 데이터가 없을 경우, null 을 리턴하도록 함
//- 다양한 데이터 타입을 다룰 수 있도록, Java Genric 타입 문법을 활용해보기

    public static class MyStack<T> {
        private List<T> data = new ArrayList<T>();

        public void push(T item) {
            if (data != null) {
                data.add(item);
            } else {
                data = new ArrayList<T>();
                data.add(item);
            }
        }

        public T pop() {
            if (!data.isEmpty()) {
                return data.remove(data.size() - 1);
            }
            return null;
        }

        public boolean isEmpty() {
            return data.isEmpty();
        }
    }
}
