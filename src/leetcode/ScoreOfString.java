package leetcode;

public class ScoreOfString {

    public static void main(String[] args) {

        String s = "hello";
        int result =0;
        for(int i=0;i<s.length();i++){
            int j= i+1;
            if(j<s.length()){
                result += Math.abs(s.charAt(i)-s.charAt(j));
            }
        }
        System.out.println(result);
    }

}
