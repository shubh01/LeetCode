package java8;

import java.util.Arrays;
import java.util.List;

public class ArrayMultiplyAllElementsReduceOperation {

    public static void main(String[] args) {
        int[] data = new int[] {1,2,3,4,5};
        List<Integer> integers = Arrays.stream(data).boxed().toList();
        Integer result = integers.stream().reduce((a,b) -> a*b).get();
        System.out.println(result);
    }

}
