package leetcode;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class SingleNumber {

    public static void main(String[] args) {
        System.out.println(singleNumberA2(new int[]{4,1,2,1,2,4}));
    }

    public static int singleNumberA1(int[] nums) {
        Map<Integer,Long> data = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
        return (data.entrySet().stream().filter(e -> e.getValue()==1).findFirst().map(Map.Entry::getKey).orElse(0));
    }

    public static int singleNumberA2(int[] nums) {
        int result =0;
        for(int num:nums){
            result^=num;
        }
        return result;
    }
}
