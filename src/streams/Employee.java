package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {

    int empId;
    String empName;
    long empSalary;

    public Employee(int empId, String empName, long empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public long getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(long empSalary) {
        this.empSalary = empSalary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }


    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"John",23000));
        employees.add(new Employee(2,"Doug",190000));
        employees.add(new Employee(3,"Jack",200000));
        employees.add(new Employee(4,"Daisy",240000));
        employees.add(new Employee(5,"William",220000));

        //Print the employee data by sorting employee salaries in descending order.

        List<Employee> sortedEmployees = employees.stream().sorted((o1, o2) -> Long.compare(o2.empSalary,o1.empSalary)).collect(Collectors.toList());
        System.out.println(sortedEmployees);

        //Filter the employee names starting with ‘J’

         List<Employee> jNameEmployees = employees.stream().filter(e-> e.empName.startsWith("J")).collect(Collectors.toList());
        System.out.println(jNameEmployees);

        //Add 10000 to each employee’s salary and print

        employees.stream().map(e -> {

            long salary = e.getEmpSalary();
            e.setEmpSalary(salary+10000);
            return e;
        }).collect(Collectors.toList()).stream().forEach(e-> System.out.println(e));

    }

}
