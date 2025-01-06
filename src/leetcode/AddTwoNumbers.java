package leetcode;

import java.math.BigInteger;

public class AddTwoNumbers {

    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        while(l1 != null){
            s1.append(l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            s2.append(l2.val);
            l2 = l2.next;
        }

        s1.reverse();
        s2.reverse();

        BigInteger b1 = new BigInteger(s1.toString());
        BigInteger b2 = new BigInteger(s2.toString());

        b1 = b1.add(b2);

        s1=new StringBuilder(b1.toString());

        return null;

    }

}
