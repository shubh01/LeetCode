package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortEmployeeList {

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

           employees.sort(Comparator.comparing(Employee::getId));

        //group by comparator

        Comparator<Employee> groupbyComparator = Comparator.comparing(Employee::getCity).thenComparing(Employee::getName);

        employees.sort(groupbyComparator);

        System.out.println(employees);

    }

}
