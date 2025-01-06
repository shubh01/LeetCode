package leetcode;

import java.util.ArrayList;

public class Substrings {

    public static void main(String[] args) {
//        subStrings("abc");
        ArrayList<String> result = new ArrayList<>();
        subSequenceRecursion("abc",0,result , "");
        System.out.println(result);
    }

    private static void subStrings(String data){
        for(int i=0;i<data.length();i++){
            String result ="";
            for(int j=i;j<data.length();j++){
                result+=data.charAt(j);
                System.out.println(result);
            }
        }
    }

    private static void subSequenceRecursion(String data, int index, ArrayList<String> result, String tempString){
        if(index == data.length()){
            result.add(tempString);
            return;
        }
        subSequenceRecursion(data,index+1, result, tempString+data.charAt(index));
        subSequenceRecursion(data,index+1, result, tempString);
    }

}
