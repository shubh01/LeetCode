package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static void main(String[] args) {

        int length = 3;

        List<String> ans = new ArrayList<>();

        generateParentheses(ans,length,0,0,"");

        System.out.println(ans);


    }


    private static void generateParentheses(List<String> ans, int length, int openLength, int closeLength, String tmp){

        if(tmp.length()==length*2) {
            ans.add(tmp);
            return;
        }

        if(openLength<length)
            generateParentheses(ans,length,openLength+1,closeLength,tmp+"(");

        if(closeLength<openLength)
            generateParentheses(ans,length,openLength,closeLength+1,tmp+")");

    }


}
