package leetcode;

import org.w3c.dom.NodeList;

public class ListNode {

     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution1 {

    public static void main(String[] args) {
            ListNode a = new ListNode(1);
            ListNode b = new ListNode(13,a);
            ListNode c = new ListNode(2,b);


        ListNode d = new ListNode(1);
        ListNode e = new ListNode(13,d);
        ListNode f = new ListNode(2,e);

        ListNode result = mergeTwoLists(null,f);

        while(result!=null){
            System.out.println("values: "+result.val);
            result = result.next;
        }

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode lastNode = null;
        lastNode = list1;
        ListNode head = null;
        if(list1 != null){
            lastNode = list1;
            head = list1;
        }else if(list2 != null){
            lastNode = list2;
            head = list2;
        }

        while(lastNode != null && lastNode.next!=null){
            lastNode=lastNode.next;
        }
        if(list1 != null){
            lastNode.next=list2;
            return head;
        }else{
            sortList(head);
            return head;
        }
    }

    private static void sortList(ListNode list1){
        ListNode current = list1;
        ListNode next = null;

        while(current!=null){
            next = current.next;
            while(next!=null){

                if(current.val> next.val){
                    int temp = next.val;
                    next.val= current.val;;
                    current.val= temp;
                }
                next = next.next;
            }
            current=current.next;
        }
    }


}

