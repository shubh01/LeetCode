package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class MaxWater {



    public static void main(String[] args) {


        System.out.println(maxWater1(new int[]{1,8,6,2,5,4,8,3,7}));

    }

    static int maxWater(int[] height){

        int max=0;

        HashSet<Integer> resultSet = new HashSet<>();
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j< height.length;j++){
                resultSet.add((j-i)*Math.min(height[i],height[j]));
            }
        }
        return resultSet.stream().max(Comparator.naturalOrder()).get();
    }

    static int maxWater1(int[] height){

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

}
