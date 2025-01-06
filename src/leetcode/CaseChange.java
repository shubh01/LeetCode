package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CaseChange {

    public static void main(String[] args) {
        String input = "Shubhashish is a good programmer";
        List<String> data = Arrays.stream(input.split(" ")).collect(Collectors.toList());
        Collections.reverse(data);
        String result = data.stream().map(e-> {
         if(Character.isLowerCase(e.charAt(0))){
            return Character.toUpperCase(e.charAt(0))+e.substring(1);
            }else{
             return Character.toLowerCase(e.charAt(0))+e.substring(1);
         }
        }).collect(Collectors.joining(",")).replaceAll(","," ");
        System.out.println(result);
    }

}
