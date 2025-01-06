package leetcode;

import java.util.ArrayList;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        Boolean isCyclic = Boolean.FALSE;
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode current = head;
        while(current != null){
            if(!list.contains(current)){
                list.add(current);
                current=current.next;
            }else{
                isCyclic = Boolean.TRUE;
                break;
            }
        }
        return isCyclic;
    }

}
