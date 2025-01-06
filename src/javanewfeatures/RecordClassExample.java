package javanewfeatures;

public class RecordClassExample {

    private String name;
    private Integer age;


    public record Person(String name, int age) {
    }

}
