package algo;

import java.util.*;
import java.util.stream.Collectors;

public class Java8Test {

    public static void main(String[] args) {
/*        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("a",1);
        hashMap.put("b",2);
        hashMap.put("c",3);
        hashMap.put("d",4);
        hashMap.put("e",5);
        hashMap.put("f",6);
        hashMap.put("g",7);
        hashMap.put("h",8);
        LinkedHashMap<String,Integer> linkedHashMap = hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(e -> e.getKey(), e-> e.getValue(),(e1, e2) -> e2,LinkedHashMap::new));
        linkedHashMap.entrySet().stream().forEach(e -> {
            System.out.println("key: "+e.getKey()+" value: "+e.getValue());
        });*/



        HashMap<String, List<Integer>> hashMap = new HashMap<>();

        hashMap.put("a",Arrays.asList(new Integer[]{1,2,3,4,5}));
        hashMap.put("b",Arrays.asList(new Integer[]{6,7,8,9,10}));
        hashMap.put("c",Arrays.asList(new Integer[]{11,12,13,14,15}));
        hashMap.put("d",Arrays.asList(new Integer[]{16,17,18,19,20}));
        hashMap.put("e",Arrays.asList(new Integer[]{21,22,23,24,25}));

        List<Integer> data = hashMap.entrySet().stream().flatMap(e -> e.getValue().stream()).collect(Collectors.toList());

        System.out.println(data);

        data = data.stream().map(e -> e*2).collect(Collectors.toList());

        System.out.println(data);
    }

}