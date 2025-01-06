package leetcode;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        plusOne(new int[]{4,3,2});
    }

    public static int[] plusOne(int[] digits) {

        int j=0;
        for(int i= digits.length-1;i>=0;i--){
            if(j==0){
                int temp =digits[i]+1;
                if(temp>9){
                    digits[i]=0;
                }else{
                    digits[i]=digits[i]+1;
                    j+=1;
                }
            }else{
                System.out.println("digits: "+digits[i]);
                digits[i]=digits[i];
            }

        }
        if(digits[0]==0){
            digits=new int[digits.length+1];
            digits[0]=1;
        }
        Arrays.stream(digits).forEach(e-> System.out.println(e));
        return null;
    }

}
