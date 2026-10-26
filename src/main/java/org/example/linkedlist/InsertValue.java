package org.example.linkedlist;

public class InsertValue {
    public static void main(){
        ListNode head = new ListNode(5);
        head.next = new ListNode(10);
        head.next.next = new ListNode(15);
        head.next.next.next = new ListNode(20);

        printAllElements(head);
//        insertValue(head,15);
    }

    public static void printAllElements(ListNode listNode){
        ListNode tem = listNode;
        while (tem != null){
            System.out.println(tem.val);
            tem=tem.next;
        }
    }
    public static ListNode insertValue(ListNode list, int val){
        ListNode temp = new ListNode();
        ListNode newNode = new ListNode(val,temp);

        ListNode head = list;
        while (list.next!=null){
            if(list.val<=val && list.next.val> val){
                ListNode nextNode = list.next;
                list.next = newNode;

                list.next.next = nextNode;
                break;
            }
            list=list.next; // updating list to move forward
        }
        return head; // return head
    }
}

class ListNode{
    int val;
    ListNode next;

    ListNode(){}
    ListNode(int val, ListNode next){
        this.val=val;
        this.next= next;
    }

    ListNode(int val){
        this.val=val;
    }
}
