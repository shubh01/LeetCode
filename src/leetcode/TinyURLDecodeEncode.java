package leetcode;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

public class TinyURLDecodeEncode {

    public static void main(String[] args) {

        String url = "https://actor.example.com/brake?bubble=bag";

        String[] data = url.split("/");
        StringBuilder result = new StringBuilder();
        Arrays.stream(data).forEach(e->{
            if(!e.isBlank() && !e.isEmpty() && !e.equalsIgnoreCase("https:") && !e.equalsIgnoreCase("leetcode.com")){
               String temp = Base64.getEncoder().encodeToString(e.getBytes());
               result.append(temp);
            }else{
                result.append(e);
            }
            result.append("/");
        });
        if(url.charAt(url.length()-1)=='/')
            result.append("/");
        System.out.println("result: "+result.substring(0,result.length()-1));

/*        String tempo = Base64.getEncoder().encodeToString("test".getBytes());
        System.out.println(new String(Base64.getDecoder().decode(tempo), StandardCharsets.UTF_8));*/

        String longURL = "https://YWN0b3IuZXhhbXBsZS5jb20=/YnJha2U/YnViYmxlPWJhZw==";
        String[] data1 = longURL.split("/");
        StringBuilder result1 = new StringBuilder();
        Arrays.stream(data1).forEach(e->{
            System.out.println("e: "+e);
            if(!e.isBlank() && !e.isEmpty() && !e.equalsIgnoreCase("https:") && !e.equalsIgnoreCase("leetcode.com")){
                String temp = new String(Base64.getDecoder().decode(e),StandardCharsets.UTF_8);
                result1.append(temp);
            }else{
                result1.append(e);
            }
            result1.append("/");
        });
        if(longURL.charAt(url.length()-1)=='/')
            result1.append("/");
        System.out.println("result1: "+result1.substring(0,result1.length()-1));

    }


}
