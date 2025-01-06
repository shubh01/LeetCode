package leetcode;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
        int[] data = new int[]{0,1,2,2,3,0,4,2};
        System.out.println("result -"+removeElement(data,2));

        Arrays.stream(data).forEach(e-> System.out.println(e));

    }

    public static int removeElement(int[] nums, int val) {
        int j=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                j+=1;
                nums[j]=nums[i];
            }
        }
        return j+1;
    }

}
