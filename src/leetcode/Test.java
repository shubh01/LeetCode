package leetcode;


/*
* You have an array of Person objects with attributes name, age, gender, and city. Implement a Java method that takes
* this array and returns a map where the keys are genders, and the values are lists of cities where female persons older than 25 live.
Sample data:

String[][] persons = {
                {"Alice", "28", "Female", "New York"},
                {"Bob", "22", "Male", "Los Angeles"},
                {"Charlie", "30", "Male", "Chicago"},
                {"Diana", "26", "Female", "New York"},
                {"Eva", "24", "Female", "San Francisco"}
        };
Output: {Female=[New York]}
* */


import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {

       /* String[][] persons = {
                {"Alice", "28", "Female", "New York"},
                {"Bob", "22", "Male", "Los Angeles"},
                {"Charlie", "30", "Male", "Chicago"},
                {"Diana", "26", "Female", "New York"},
                {"Eva", "24", "Female", "San Francisco"}
        };*/

        String[][] persons = {
                {"Alice", "28", "Female", "New York"},
                {"Bob", "22", "Male", "Los Angeles"},
                {"Charlie", "30", "Male", "Chicago"},
                 {"Fatima", "29", "Female", "India"},
                {"Diana", "26", "Female", "New York"},
                {"Eva", "24", "Female", "San Francisco"}
        };


//        Arrays.stream(persons).collect(Collectors.toMap(kv-> kv[0],kv -> kv[1],(oldv,newv)-> Collectors.toList()));

        Map<String,Set<String>> data1 = Arrays.stream(persons).filter(values-> Integer.valueOf(values[1])>25 && values[2].equalsIgnoreCase("Female")).collect(Collectors.groupingBy(values -> values[2],Collectors.mapping(values-> values[3],Collectors.toSet())));

        System.out.println(data1);


        HashMap<String, List<String>> output = new HashMap<>();
        for(String[] data:persons){
            if(!output.containsKey(data[2])){
                if(Integer.valueOf(data[1])>25 && data[2].equalsIgnoreCase("Female")) {
                    ArrayList<String> cityList = new ArrayList<>();
                    cityList.add(data[3]);
                    output.put(data[2], cityList);
                }
            }else if(Integer.valueOf(data[1])>25){
               ArrayList<String> listCity = (ArrayList<String>) output.get(data[2]);
               if(!listCity.contains(data[3])){
                   listCity.add(data[3]);
                   output.put(data[2], listCity);
               }
            }
        }

        System.out.println(output);

        /*
        *
Input : Shubhashish is a good programmer
Output: Programmer Good A Is shubhashish
        *
        * */


        String input = "Shubhashish is a good programmer";
/*
//        A=65
  //              a=97
        String[] data = input.split
               for(i=data.length;i>=0)
        data[i].charAt(0)>=97 && <=123
                String.valueOf(input.charAt(0)).toUpperCase()+""+input.substring(1);

        data[0].charAt(0)>=65 && <=97
        String.valueOf(input.charAt(0)).toLowerCase()+""+input.substring(1);



//        output.entrySet().stream().forEach(e -> System.out.println("key: "+e.getKey()+" value "+e.getValue()));*/
    }

}
