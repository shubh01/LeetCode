package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{0,1,2,4,5,7}));
    }

    public static List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList<>();

        for(int i=0;i< nums.length;i++){
            int tmp =nums[i];
            String data = ""+tmp;
            for(int j=i+1;j< nums.length;j++){
                if(Math.abs(nums[j]-nums[i]) == 1 || Math.abs(nums[j]-nums[i]) ==0){
                    data =tmp+"->"+nums[j];
                    i++;
                }else{
                    break;
                }
            }
            result.add(data);
        }

        return result;
    }

}
