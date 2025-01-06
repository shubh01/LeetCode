package algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 
 * Employee 
    int id;
    String name;
    double salary;
    List<Integer> subOrdinate;
List<Employee> empList;
 * 
 * 
 * */

class Employee{
	
	private Integer id;
	private String name;
	private Double salary;
	
	private List<Integer> subOrdinate;

	public Employee(Integer id, String name, Double salary, List<Integer> subOrdinate) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.subOrdinate = subOrdinate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public List<Integer> getSubOrdinate() {
		return subOrdinate;
	}

	public void setSubOrdinate(List<Integer> subOrdinate) {
		this.subOrdinate = subOrdinate;
	}		
}

public class Test{

	
	static List<Employee> employeeList = new ArrayList<Employee>();
	
	static {		
		employeeList.add( new Employee(2, "robin", Double.parseDouble("5000"), null));
		employeeList.add( new Employee(3, "steve", Double.parseDouble("5000"), null));
		employeeList.add( new Employee(1, "john", Double.parseDouble("5000"), Arrays.asList(new Integer[] {2,3})));
	}
	
	public static void main(String[] args) {
		System.out.println(getSalary(1));		
	}
	
	private static Double getSalary(Integer id) {	
		Employee e1 = (Employee) employeeList.stream().filter(e -> e.getId().equals(id)).findFirst().get();	
		List<Integer> subOrdinates = e1.getSubOrdinate();		
		List<Employee> subOrdinateList = (List<Employee>) employeeList.stream().
				filter(e -> (subOrdinates.stream().anyMatch(id2 -> id2.equals(e.getId())))).collect(Collectors.toList());		
		Double netSalary = subOrdinateList.stream().collect(Collectors.summingDouble(Employee:: getSalary));
		return netSalary+e1.getSalary();		
	}
	
}
