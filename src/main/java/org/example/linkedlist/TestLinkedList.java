package org.example.linkedlist;

public class TestLinkedList {
    public static void main(String[] args){
        // Creation on nodes Method - 01
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        node1.next = node2;
        node2.next = node3;

//        Creation of nodes Method = 02
        Node head = new Node(100);
        head.next = new Node(200);
        head.next.next = new Node(300);
        head.next.next.next = new Node(400);
    }

}


class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}