package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MaximumLengthUniqueChars {


    public static void main(String[] args) {
        char a=97;
//        System.out.println(a);

//        System.out.println(isUniqueString("abcd"));

//        System.out.println(maxLength(Arrays.asList(new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p"})));
//        System.out.println(maxLength(Arrays.asList(new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p"})));
//        System.out.println(maxLength(Arrays.asList(new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p"})));
//        System.out.println(maxLength(Arrays.asList(new String[]{"abcdefghijklmnopqrstuvwxyz"})));
        System.out.println(new MaximumLengthUniqueChars().maxLength(Arrays.asList(new String[]{"cha","r","act"})));
//        System.out.println(maxLength(Arrays.asList(new String[]{"un","iq","ue"})));
    }


    public int maxLength(List<String> arr) {
        return solve(0, arr, "");
    }

    public int solve(int index, List<String> arr, String input) {

        if(index == arr.size()) {
            if (isValid(input)) {
                return input.length();
            }
            return 0;
        }
        int take = solve(index+1, arr, input+arr.get(index));
        int notTake = solve(index+1, arr, input);
        return Math.max(take, notTake);
    }

    public boolean isValid(String s) {
        int freq[] = new int[26];
        for(int i = 0; i < s.length(); i++) {
            int val = s.charAt(i) - 'a';
            freq[val]++;
            if(freq[val] > 1) return false;
        }
        return true;
    }

    public static int maxLength1(List<String> arr) {

        String[] inputData = arr.stream().toArray(String[]::new);
        int result =0;
        String test="";



        for(int i=-1;i<inputData.length;i++){
            for(int j=i+1;j<inputData.length;j++){
                if(isUniqueString(inputData[j])){
                    if(result<inputData[j].length())
                        result=inputData[j].length();
                    String temp=test+inputData[j];
                    if(isUniqueString(temp)){
                        test=temp;
                        if(result<temp.length())
                            result=temp.length();
                        System.out.println("test: "+test);
                    }
                }
            }
            System.out.println();
        }

        return result;

    }

    //        System.out.println(maxLength(Arrays.asList(new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p"})));

    private static void print(String[] data){

        ArrayList<String> resultSet = new ArrayList<>();
        backtracking(resultSet,new HashSet<String>(),data,0);
        System.out.println(resultSet);

    }


    private static ArrayList<String> backtracking(ArrayList<String> resultSet, HashSet<String> temp, String[] data, int start){
        resultSet.addAll(temp);
        for(int i=start;i< data.length;i++){

            temp.add(data[i]);
            backtracking(resultSet,temp,data,i+1);
            temp.remove(temp.size()-1);
//            backtracking(resultSet,temp,data,i-1);

        }
        return null;
    }


    private static Boolean isUniqueString(String data){
        Boolean isUnique = Boolean.TRUE;
        Character[] chars = new Character[26];
        for(int i=0;i<data.length();i++){
            if(chars[data.charAt(i)-97]!=null){
                isUnique = Boolean.FALSE;
                break;
            }else chars[data.charAt(i)-97]=data.charAt(i);
        }
        return isUnique;
    }


}
