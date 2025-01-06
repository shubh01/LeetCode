package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        generatePalindromeSubStrings("aab",ans);
        System.out.println(ans);
    }


    private static void generatePalindromeSubStrings(String source, ArrayList<ArrayList<String>> ans){
        for(int i=0;i<source.length();i++){
            ArrayList<String> tmpString = new ArrayList<>();
            for(int j=i+1;j<=source.length();j++){
                String tmp = source.substring(i,j);
                if(isPalindrome(tmp)){
                    tmpString.add(tmp);
                }
            }
            ans.add(tmpString);
        }
    }

    private static Boolean isPalindrome(String tmp){

        if(tmp.equalsIgnoreCase(new StringBuilder(tmp).reverse().toString()))
            return Boolean.TRUE;
        return Boolean.FALSE;

    }
}
