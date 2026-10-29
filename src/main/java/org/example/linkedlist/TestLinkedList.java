package org.example.linkedlist;

public class TestLinkedList {
    public static void main(String[] args){
        Node head1 = new Node(5,new Node(10,new Node(15,new Node(20))));

        Node head2 = new Node(100);
        head2.next= new Node(110);
        head2.next.next = new Node(120);
        head2.next.next.next = new Node(130);

        countNodes(head2);
    }

    public static void countNodes(Node head){
        int count = 0;
        Node temp = head;
        while (temp!=null){
            count++;
            System.out.println(temp.val);
            temp=temp.next;
        }
        System.out.println(count);
    }

}


class Node{
   int val;
   Node next;

   Node(int val, Node next){
       this.val = val;
       this.next= next;
   }
    Node (int val){
       this.val = val;
    }

    Node(){}

}