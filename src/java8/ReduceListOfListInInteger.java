package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReduceListOfListInInteger {

    public static void main(String[] args) {
        List<ArrayList<Integer>> data = new ArrayList<>();
        System.out.println(data);

        ArrayList<Integer> d1 = new ArrayList<>();
        d1.add(1);
        d1.add(2);
        d1.add(3);
        d1.add(4);
        d1.add(5);

        ArrayList<Integer> d2 = new ArrayList<>();
        d2.add(1);
        d2.add(2);
        d2.add(3);
        d2.add(4);
        d2.add(5);

        data.add(d1);
        data.add(d2);

        System.out.println(data);


        Integer resultFinal = data.stream().map(integers -> {
            return integers.stream().reduce((integer, integer2) -> Integer.valueOf(String.valueOf(integer+""+integer2))).get();
        }).collect(Collectors.toList()).stream().reduce((integer, integer2) -> integer+integer2).get();

        System.out.println(resultFinal.intValue());

    }

}
