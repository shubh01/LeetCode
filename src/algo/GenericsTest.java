package algo;

public class GenericsTest<T extends A> {

    public void test(T t){
        System.out.println("Here i am in test method");
    }

    public static void main(String[] args) {
        GenericsTest genericsTest = new GenericsTest();
        genericsTest.test(new B());
    }

}

class A{

}

class B extends A{

}