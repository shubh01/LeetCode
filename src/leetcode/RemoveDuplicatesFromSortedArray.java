package leetcode;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] data = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(data));;

        Arrays.stream(data).forEach(e-> System.out.println(e));
    }

    public static int removeDuplicates(int[] nums) {
            int j=0;
            for(int i=1;i<nums.length;i++){
                if(nums[j]!=nums[i]){
                    j+=1;
                    nums[j]=nums[i];
                }
            }
            return j+1;
    }

}
