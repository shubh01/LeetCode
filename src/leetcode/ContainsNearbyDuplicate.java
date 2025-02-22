package leetcode;

import java.util.HashMap;

public class ContainsNearbyDuplicate {

    public static void main(String[] args) {

    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer,Integer> numIndexMap = new HashMap<>();

        Boolean result = Boolean.FALSE;

        for(int i=0;i<nums.length;i++){
            if(numIndexMap.containsKey(nums[i]) && Math.abs(numIndexMap.get(nums[i])-i)<=k){
                result = Boolean.TRUE;
                break;
            }else{
                numIndexMap.put(nums[i],i);
            }
        }
        return result;
    }

}
