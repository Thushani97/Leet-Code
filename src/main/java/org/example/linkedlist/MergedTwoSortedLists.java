package org.example.linkedlist;

public class MergedTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        while(list1.next!=null){
            if(list1.val<= list2.val){
                list1.next=list2;
            } else {
                list2.next=list1;
            }
        }
        return list1;
    }

    class ListNode{
        int val;
        ListNode next;

        ListNode(){}

        ListNode(int val){
            this.val = val;
        }

        ListNode (int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
}

