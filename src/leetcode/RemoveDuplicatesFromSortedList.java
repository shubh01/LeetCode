package leetcode;

public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode data= head;
        ListNode current = head;
        while(current != null){
            if(current.val==current.next.val){
                current.next=current.next.next;
            }else{
                current=current.next;
            }
        }
        return data;
    }

}
