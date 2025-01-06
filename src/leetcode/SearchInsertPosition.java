package leetcode;

public class SearchInsertPosition {


    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6},2));
    }


    public static int searchInsert(int[] nums, int target) {
        int index =-1;

        if(nums[0]==target || nums[0]>target)
            return 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                index=i;
                break;
            }else if(nums[i]>target){
                index=i;
                break;
            }
        }

        if(index==-1){
            index=nums.length;
        }

        return index;
    }

}
