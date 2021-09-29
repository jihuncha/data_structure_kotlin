package com.huni.java.datastructure.ch07_linkedlist;

public class SingleLinkedList<T> {
    public Node<T> head = null;

    //노드 클래스
    public class Node<T> {
        T data;
        Node<T> next = null;

        public Node(T data) {
            this.data = data;
        }
    }

    public void addNode(T data) {
        if (head == null) {
            head = new Node<T>(data);
        } else {
            Node<T> node = this.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node<T>(data);
        }
    }

    public void printAll() {
        if (head != null) {
            Node<T> node = this.head;
            System.out.println(node.data);

            while (node.next != null) {
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public Node<T> search(T checkData) {
        if (this.head == null) {
            return null;
        } else {
            Node<T> node = this.head;
            if (node.data == checkData) {
                return node;
            } else {
                while (node != null) {
                    if (node.data == checkData) {
                        return node;
                    } else {
                        node = node.next;
                    }
                }
                return null;
            }
        }
    }

    public void addNodeInside(T data, T isData) {
        Node<T> searchedNode = this.search(isData);

        if (searchedNode == null) {
            this.addNode(data);
        } else {
            Node<T> nextData = searchedNode.next;
            searchedNode.next = new Node<T>(data);
            searchedNode.next.next = nextData;
        }
    }
}
