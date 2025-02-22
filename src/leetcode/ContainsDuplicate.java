package leetcode;

import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }

    public static boolean containsDuplicate(int[] nums) {
       HashSet<Integer> data = new HashSet();
        Boolean result = Boolean.FALSE;
        for(int i:nums){
            if (!data.add(i)){
                result = Boolean.TRUE;
                break;
            }
        }
        return result;
    }

}
