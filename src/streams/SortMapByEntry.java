package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class SortMapByEntry {

    public static void main1(String[] args) {

        HashMap<String, Integer> data = new HashMap<>();

        data.put("a",1);
        data.put("b",2);
        data.put("c",3);
        data.put("d",4);
        data.put("e",5);
        data.put("f",6);
        data.put("g",7);
        data.put("h",8);
        data.put("i",9);

        LinkedHashMap<String,Integer> sortedMap = data.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(e-> e.getKey(), e-> e.getValue(),(e1,e2) -> e2, LinkedHashMap::new));
        LinkedHashMap<String,Integer> sortedMapReverse = data.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder())).collect(Collectors.toMap(e-> e.getKey(), e-> e.getValue(),(e1,e2) -> e2, LinkedHashMap::new));

        sortedMap.entrySet().stream().forEach(e-> System.out.println("key: "+e.getKey()+" value: "+e.getValue()));
        System.out.println("reverse");
        sortedMapReverse.entrySet().stream().forEach(e-> System.out.println("key: "+e.getKey()+" value: "+e.getValue()));
    }


    public static void main2(String[] args) {
        List<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(5);
        data.add(6);
        data.add(7);
        data.add(8);
        data.add(9);
        data.add(10);
        data.add(11);
        data.add(12);
        List<Integer> evenList = data.stream().filter(e-> e%2==0).collect(Collectors.toList());
        List<Integer> oddList = data.stream().filter(e-> e%2!=0).collect(Collectors.toList());
        System.out.println("evenList: "+evenList);
        System.out.println("iddList: "+oddList);

    }

    public static void main3(String[] args) {
        String s= "sabsabhuritoiuthjbhasehiokloiuythdnj";
        Map<String, Long> data = s.chars().mapToObj(Character::toString).collect((Collectors.groupingBy(Function.identity(), Collectors.counting())));
        data.entrySet().forEach(e-> System.out.println(e.getKey()+" "+e.getValue()));

    }

    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(5);
        data.add(2);
        data.add(3);
        data.add(6);
        data.add(8);
        data.add(10);

       List<Integer> listValues = data.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(e-> e.getValue()>=2).map(e-> new Integer(e.getKey())).collect(Collectors.toList());
        System.out.println(listValues);
    }

}
