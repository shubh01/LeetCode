package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ThreadPoolExecutor;

public class TwoSum {


    public static void main(String[] args) {
        int[] result = twoSum(new int[]{2,7,11,15},9);
        Arrays.stream(result).forEach(e-> System.out.println(e));

    }


    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                //System.out.println("nums[i]+nums[j] "+(nums[i]+nums[j]));
                if(j< nums.length && (nums[i]+nums[j] == target)){
                    result[0]=i;
                    result[j]=j;
                }
            }
        }
        return result;
    }

    public static int[] twoSumOptimized(int[] nums, int target) {

        HashMap<Integer, Integer> data = new HashMap<>();
        for(int i=0;i< nums.length;i++){
            data.put(nums[i],i);
        }
        for(int i=0;i< nums.length;i++){

            int temp = target - nums[i];

            if(data.containsKey(temp) && data.get(temp) != i){
                return new int[] {i,data.get(temp)};
            }
        }

        return null;
    }


}
