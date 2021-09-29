package com.huni.java.datastructure.ch07_linkedlist;

//노드 클래스
public class Node<T> {
    T data;
    Node<T> next = null;

    public Node(T data) {
        this.data = data;
    }
}
