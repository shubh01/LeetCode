package algo;

public class Child2 extends Chaild1{

    private String name="child";

    public static void main(String[] args) {
        Child2 child2 = new Child2();
        System.out.println(new Child2().name);
        System.out.println(((Prent)child2).name);
    }

}
