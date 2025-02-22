package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {

    public static void main(String[] args) {
//        averageOfList();
//        toLowerCaseAndUpperCaseList();
//        sumOfEvenNos();
//        removeDuplicate();
//        numberOfStringWithLetter();
//        sortListAsc();
//        sortListStringAsc();
//        maxElementList();
//        secondMaxElementList();
//        firstElementInTheStream();
//        countCharInString();
//        countSubString();
//        duplicateElementInString();
        reduceExample();
    }

    private static void averageOfList(){
        List<Integer> listData = new ArrayList<>();
        listData.add(1);
        listData.add(2);
        listData.add(3);
        double average = listData.stream().mapToDouble(Double::new).average().orElse(0.0);
        System.out.println(average);
    }

    private static void toLowerCaseAndUpperCaseList(){
        List<String> listData = new ArrayList<>();
        listData.add("one");
        listData.add("two");
        listData.add("three");
        listData.add("four");

        List<String> resultList = listData.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());

        System.out.println(resultList);

    }

    private static void sumOfEvenNos(){
        List<Integer> listData = new ArrayList<>();
        listData.add(1);
        listData.add(2);
        listData.add(3);
        listData.add(4);
        listData.add(5);
        listData.add(6);
        listData.add(7);
        listData.add(8);

        Integer sum = listData.stream().filter(e ->e%2==0).collect(Collectors.toList()).stream().mapToInt(Integer::new).sum();
        System.out.println(sum);
    }

    private static void removeDuplicate(){
        List<Integer> listData = new ArrayList<>();
        listData.add(1);
        listData.add(1);
        listData.add(2);
        listData.add(2);
        listData.add(3);
        listData.add(3);
        listData.add(4);
        listData.add(4);
        listData.add(5);
        listData.add(5);

        List<Integer> resultList = listData.stream().distinct().collect(Collectors.toList());
        System.out.println(resultList);
    }

    private static void numberOfStringWithLetter(){
        List<String> listData = new ArrayList<>();
        listData.add("one");
        listData.add("two");
        listData.add("three");
        listData.add("four");
        listData.add("five");
        listData.add("six");
        listData.add("seven");
        listData.add("eight");
        listData.add("nine");
        listData.add("ten");

        List<String> resultList = listData.stream().filter(s -> s.charAt(0) == 't').collect(Collectors.toList());
        System.out.println(resultList);
    }

    private static void sortListAsc(){
        List<String> listData = new ArrayList<>();
        listData.add("one");
        listData.add("two");
        listData.add("three");
        listData.add("four");
        listData.add("five");
        listData.add("six");
        listData.add("seven");
        listData.add("eight");
        listData.add("nine");
        listData.add("ten");

       List<String> resultList = listData.stream().sorted().collect(Collectors.toList());

        System.out.println(resultList);
    }

    private static void sortListStringAsc(){
        List<String> listData = new ArrayList<>();
        listData.add("one");
        listData.add("two");
        listData.add("three");
        listData.add("four");
        listData.add("five");
        listData.add("six");
        listData.add("seven");
        listData.add("eight");
        listData.add("nine");
        listData.add("ten");

        List<String> resultList = listData.stream().map(e-> {
            char[] tmp = e.toCharArray();
            Arrays.sort(tmp);
            return new String(tmp);
        }).collect(Collectors.toList()).stream().sorted().collect(Collectors.toList());

        System.out.println(resultList);
    }

    private static void maxElementList(){
        List<Integer> listData = new ArrayList<>();
        listData.add(1);
        listData.add(21);
        listData.add(13);
        listData.add(41);
        listData.add(15);
        listData.add(61);
        listData.add(17);
        listData.add(81);
        listData.add(19);
        listData.add(221);
        listData.add(133);


        Integer max = listData.stream().sorted((a,b)-> Integer.compare(b,a)).findFirst().get();

       /* Integer max = listData.stream().max(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1>o2)
                    return 1;
                else if(o2>o1)
                    return -1;
                else return 0;
            }
        }).get();
*/
        System.out.println(max);
    }

    private static void secondMaxElementList(){
        List<Integer> listData = new ArrayList<>();
        listData.add(1);
        listData.add(21);
        listData.add(13);
        listData.add(41);
        listData.add(15);
        listData.add(61);
        listData.add(17);
        listData.add(81);
        listData.add(19);
        listData.add(221);
        listData.add(133);

        Integer secondMax = listData.stream().distinct().sorted((a,b) -> Integer.compare(b,a)).skip(1).findFirst().get();


       /* Integer secondMax = listData.stream().sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1>o2)
                    return -1;
                else if(o2>o1)
                    return 1;
                else return 0;
            }
        }).collect(Collectors.toList()).get(1);

        Integer max = listData.stream().max(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1>o2)
                    return 1;
                else if(o2>o1)
                    return -1;
                else return 0;
            }
        }).get();
*/
        System.out.println(" secondMax "+secondMax);
    }


    private static void firstElementInTheStream(){
        List<Integer> data = Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9});
        Integer firstElement = data.stream().reduce((first,second) -> first).orElse(null);
        Integer sum = data.stream().reduce((first,second) -> first+second).orElse(0);
        System.out.println(" first element: "+firstElement);
    }

    private static void countCharInString(){
        String input = "shubhashish";

        Stream<Character> stream= input.chars().mapToObj(i -> (char) i);

        long count = stream.filter(e -> e.equals('s')).count();
        System.out.println(count);
    }

    private static void countSubString(){
        String input = "shubhashish";

        int initialLength = input.length();
        input = input.replace("sh","");
        int finalLength = input.length();

        int count = (initialLength-finalLength)/2;

        System.out.println(count);

    }

    private static void duplicateElementInString(){
        String input = "abcdefghd";
        Stream<Character> stream = input.chars().mapToObj(i -> (char)i);
        Map<Character,Long> map = stream.collect(Collectors.groupingBy(i->i,Collectors.counting()));
        map.entrySet().stream().forEach(e-> System.out.println(e));
        System.out.println(map.entrySet().stream().filter(e-> e.getValue().intValue()==2).findFirst().get().getKey());;
    }


    private static void reduceExample(){
        List<String> data = Arrays.asList(new String[]{"aa","bbb","cccc","dddd","eeeee"});
        System.out.println(data.stream().reduce((a,b)-> a.length()>b.length() ?a:b).get());;
    }

}
