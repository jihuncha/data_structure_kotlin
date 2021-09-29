package com.huni.java.datastructure.ch07_linkedlist;

public class Ch07_LinkedList {
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<Integer>(1);
        Node<Integer> node2 = new Node<Integer>(2);

        node1.next = node2;
        Node<Integer> head = node1; // 정확히는 Node<Integer> 가 더 맞기 때문에 변경함

        SingleLinkedList<Integer> test = new SingleLinkedList<Integer>();
        test.addNode(1);
        test.addNode(2);
        test.addNode(3);

        System.out.println(test.head.data);
        System.out.println(test.head.next.data);

        System.out.println("---------------------------------------------");
        test.printAll();

        ////////////////////////////
        System.out.println("---------------------------------------------");
        SingleLinkedList<Integer> MyLinkedList = new SingleLinkedList<Integer>();
        MyLinkedList.addNode(1);
        MyLinkedList.addNode(2);
        MyLinkedList.addNode(3);

        MyLinkedList.printAll();
        MyLinkedList.addNodeInside(5, 1);
        MyLinkedList.printAll();
        MyLinkedList.addNodeInside(6, 3);
        MyLinkedList.printAll();

        MyLinkedList.addNodeInside(7, 20);
        MyLinkedList.printAll();
    }
}
