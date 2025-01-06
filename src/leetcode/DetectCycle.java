package leetcode;

import java.util.ArrayList;
import java.util.List;

public class DetectCycle {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(3);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(0);
        ListNode listNode4 = new ListNode(-4);

        listNode.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=listNode2;

        System.out.println(detectCycle(listNode));

    }

    public static ListNode detectCycle(ListNode head) {
        if(head == null || head.next==null)
            return null;
        List<ListNode> list = new ArrayList<>();
        while(head != null && !list.contains(head)){
            list.add(head);
            head=head.next;
        }
        if(head !=null )
            return head;
        return null;
    }

}
