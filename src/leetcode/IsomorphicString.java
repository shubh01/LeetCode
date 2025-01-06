package leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

    public static void main(String[] args) {

        String s1= "badc";

        String s2 = "baba";


        if(s1.length()!=s2.length())
            System.out.println(false);

        Map<Character,Character> characterMap = new HashMap<>();
        Boolean isIsomorphic = Boolean.TRUE;
        for(int i=0;i<s1.length();i++){
            if(characterMap.containsKey(s1.charAt(i))){
                Character temp = characterMap.get(s1.charAt(i));
                if(temp!=s2.charAt(i)) {
                    isIsomorphic = Boolean.FALSE;
                    break;
                }
            }else{
                    characterMap.put(s1.charAt(i),s2.charAt(i));
            }
        }
        System.out.println(isIsomorphic);
    }

}
