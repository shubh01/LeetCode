package leetcode;

import java.util.Arrays;

public class SetMismatch {


    public static void main(String[] args) {
        System.out.println(findErrorNums(new int[]{2,3,2}));
    }

    public static int[] findErrorNums(int[] nums) {

        int sum = (nums.length)*(nums.length+1)/2;
        int duplicateNo=0;
        int sum1= 0;
        Integer[] data = new Integer[nums.length];
        for(int i=0;i< nums.length;i++){
            if(data[nums[i]-1]==null){
                data[nums[i]-1]= nums[i];
            }else duplicateNo=nums[i];
            sum1+=nums[i];
        }

        sum1-=duplicateNo;

        int missingNo = sum-sum1;

        System.out.println("missingNo: "+missingNo+" duplicateNo."+duplicateNo);


        return new int[]{duplicateNo,missingNo};

    }

}
