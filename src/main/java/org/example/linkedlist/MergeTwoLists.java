package org.example.linkedlist;

public class MergeTwoLists {

    public static void main(){
        ListNode n1 = new ListNode(1);
        n1.next = new ListNode(2);
        n1.next.next = new ListNode(4);

        ListNode n2 = new ListNode(1);
        n2.next = new ListNode(3);
        n2.next.next = new ListNode(4);



        ListNode output = mergeTwoLists(n1,n2);
        while (output!=null){
            System.out.println(output.val);
            output=output.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1==null & list2==null){
            return list1;
        }
        else if(list1==null){
            return list2;
        }else if(list2==null){
            return list1;
        }
        ListNode temp = new ListNode();

        while (list1!=null ){
//            if(list1.next!=null){
//                temp=list1.next;
//                list1.next=list2;
//                list2=temp;
//                list1=list1.next;
//            }

            if(list1.val== list2.val){
                temp=list1.next;
                list1.next=list2;
                list2=temp;
            }
            else if(list1.val< list2.val){
                temp=list1.next;
                list1.next=list2;
                list2=temp;

            }else{
                temp=list1.next;
                list1.next=list2;
                list2=temp;
            }

            list1=list1.next;
        }

        return list1;
    }


}
