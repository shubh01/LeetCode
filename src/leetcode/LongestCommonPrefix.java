package leetcode;

import java.util.Arrays;
import java.util.List;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] input = new String[] {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(input));
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String result = "";
        System.out.println("sorted: "+Arrays.asList(strs));
        for(int i=0;i<strs[0].length();i++){
            if(strs[0].charAt(i)==strs[strs.length-1].charAt(i)){
             result+=strs[0].charAt(i);
            } else break;
        }
        return result;
    }

}
