package org.example.linkedlist;

public class MiddleOfTheLinkedlist {
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
//        head.next.next.next.next.next = new ListNode(6);
        ListNode output = middleNode(head);
        while (output!=null){
            System.out.println(output.val);
            output=output.next;
        }
    }

    public static ListNode middleNode(ListNode head) {
        ListNode slowMove = head;
        ListNode fastMove = head;

        while (fastMove!= null && fastMove.next!=null){
            slowMove=slowMove.next;
            fastMove=fastMove.next.next;
        }
        return slowMove;

    }
    public static ListNode middleNode1(ListNode head) {
        ListNode tem = head;
        int count = 0;
        while (tem!=null){
            count++;
            tem=tem.next;
        }
        int middle =0;
        while (middle!=count/2){
            head=head.next;
            middle++;
        }
        return head;
    }



}


