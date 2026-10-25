package org.example.linkedlist;

public class ConvertBinaryNumberToInteger {

    public static void main(String[] args){
     NodeList node =   new NodeList();
     node.val = 24;
     node.next.val = 35; // this is wrong, bcz node.next is null. then node.next.val will throw null pointer exception
     node.next.next.val = 1;


     NodeList nodeList1 = new NodeList(10);
     nodeList1.next = new NodeList(20);
     nodeList1.next.next = new NodeList(30);
     nodeList1.next.next.next = new NodeList(40);




    }

}


class NodeList{
    int val;
    NodeList next;

    NodeList(){}
    NodeList(int val){
        this.val = val;
    }
    NodeList(int val , NodeList next){
        this.val = val;
        this.next = next;
    }
}

/*
Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10

Example 2:
Input: head = [0]
Output: 0

*/
