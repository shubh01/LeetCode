package leetcode;

import java.util.HashMap;

public class CustomStack {


    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();


        map.put(new String("hello"),"1");
        map.put(new String("hello"),"2");
        map.put(new String("hello"),"3");
        map.put(new String("hello"),"4");
        map.put(new String("hello"),"5");

        System.out.println(map.size());
        System.out.println(map.get(new String("hello")));



    }



}
