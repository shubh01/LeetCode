package leetcode;

public class Solution {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));

        System.out.println(100%10);
    }

    public static boolean isPalindrome(int x) {
        int value = x;
        int reverse =0;
        if(x<0 && (x!=0 && x%10==0)){
            return false;
        }
        while(value/10!=0){
            int reminder = value%10;
            reverse = reverse*10+reminder;
            value = value/10;
        }
        System.out.println("reverse: "+reverse);
        return reverse==x;
    }

}
