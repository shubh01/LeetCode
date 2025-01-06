package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortMapByValues {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("A","Indore",11));
        employees.add(new Employee("B","Agra",12));
        employees.add(new Employee("C","Bombay",13));
        employees.add(new Employee("D","Pune",4));
        employees.add(new Employee("E","Bangalore",45));
        employees.add(new Employee("F","Indore",26));
        employees.add(new Employee("G","Indore",87));
        employees.add(new Employee("H","Bombay",68));

        Map<Integer, List<Employee>> map = employees.stream().collect(Collectors.groupingBy(Employee::getId));

        HashMap<Employee, String> mapData = employees.stream().collect(Collectors.toMap(Function.identity(),Employee::getCity, (x,y) -> x+ "," +y, HashMap::new));

        map.entrySet().forEach(e-> {
            System.out.println("key: "+e.getKey()+" value: "+e.getValue());
        });

        mapData.entrySet().forEach(e-> {
            System.out.println("key: "+e.getKey()+" value: "+e.getValue());
        });

        HashMap<Employee, String> mapData2 = mapData.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (x,y) -> x, LinkedHashMap::new));

        mapData2.entrySet().forEach(e-> {
            System.out.println("key: "+e.getKey()+" value: "+e.getValue());
        });


    }

}
