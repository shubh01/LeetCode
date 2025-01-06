package leetcode;

import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {

        String s1= "anagram";
        String s2= "nagaram";


        if(s1.length() != s2.length())
            System.out.println(false);

        char[] c1= s1.toCharArray();
        char[] c2= s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);
        s1= new String(c1);
        s2= new String(c2);

        System.out.println(s1.equals(s2));
    }

}
