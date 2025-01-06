package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class LongestPalindrome {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("a"));
    }

    public static int longestPalindrome(String s) {
        int oddCount =0;
        Map<Character,Integer> map = new HashMap<>();
        for(Character e:s.toCharArray()){
            map.put(e,map.getOrDefault(e,0)+1);
            if(map.get(e)%2==1){
                oddCount++;
            }else{
                oddCount--;
            }
        }
        if(oddCount>1)
           return s.length()-oddCount+1;
        return s.length();
    }
}
