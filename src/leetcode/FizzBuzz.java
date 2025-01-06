package leetcode;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    /*
    * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.
* */

    public static void main(String[] args) {
        /*List<String> output = new ArrayList<>();
        int n=5;
        for(int i=1;i<=n;i++){
            if(i%3 == 0 && i%5==0){
                output.add("FizzBuzz");
            }else if(i%3 == 0){
                output.add("Fizz");
            }else if(i%5 == 0){
                output.add("Buzz");
            }else{
                output.add(String.valueOf(i));
            }
        }
        System.out.println(output);*/
        System.out.println(anotherApproach(5));
    }

    public static List<String> anotherApproach(int n){

        return new AbstractList<String>() {
            @Override
            public String get(int i) {
                i=i+1;
                if(i%3 == 0 && i%5==0){
                    return "FizzBuzz";
                }else if(i%3 == 0){
                    return "Fizz";
                }else if(i%5 == 0){
                   return "Buzz";
                }else{
                    return String.valueOf(i);
                }
            }
            @Override
            public int size() {
                return n;
            }
        };

    }


}
