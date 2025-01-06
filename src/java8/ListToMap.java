package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap {

    public static void main1(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("A","Indore",11));
        employees.add(new Employee("B","Agra",12));
        employees.add(new Employee("C","Bombay",13));
        employees.add(new Employee("D","Pune",4));
        employees.add(new Employee("E","Bangalore",45));
        employees.add(new Employee("F","Indore",26));
        employees.add(new Employee("G","Indore",87));
        employees.add(new Employee("H","Bombay",68));


        Map<String, List<Employee>> map = employees.stream().collect((Collectors.groupingBy(Employee::getCity)));
        map.entrySet().stream().forEach(e -> System.out.println("key: "+e.getKey()+" value: "+e.getValue()));


        Map<Employee, Long> map2 = employees.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map2.entrySet().stream().forEach(e-> System.out.println("key: "+e.getKey()+" value: "+e.getValue()));

    }


    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();
        data.add("apple");
        data.add("apple2");
        data.add("banana");
        data.add("banana2");
        data.add("appricot");
        data.add("orange");
        data.add("mango");
        data.add("lemon");
        data.add("chiku");


        HashMap<Character,List<String>> dataMap =  data.stream().collect(Collectors.toMap(x-> x.charAt(0), x-> data.stream().filter(y-> y.startsWith(String.valueOf(x.charAt(0)))).
                collect(Collectors.toList()),(oldVal, newVal) -> oldVal, HashMap::new));


       HashMap<Character,Long> map= data.stream().collect(Collectors.toMap(x-> x.charAt(0),x-> data.stream().filter(y -> y.startsWith(String.valueOf(x.charAt(0)))).count(),(oldV,newV) -> oldV,HashMap::new));

        map.entrySet().stream().forEach(e-> System.out.println("key: "+e.getKey()+" value: "+e.getValue()));

        dataMap.entrySet().stream().forEach(e-> System.out.println("key: "+e.getKey()+" value: "+e.getValue()));

    }

}
