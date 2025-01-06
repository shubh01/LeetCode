package java8;

public class Employee {

    private String name;
    private String city;
    private Integer id;

    public Employee(String name, String city, Integer id) {
        this.name = name;
        this.city = city;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
