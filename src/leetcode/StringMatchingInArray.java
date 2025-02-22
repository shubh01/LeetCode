package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringMatchingInArray {

    public static void main(String[] args) {

        String[] data = new String[] {"mass","as","hero","superhero"};


        List<String> result = new ArrayList<>();

        result = Stream.of(data).filter(e1 -> {
          return Stream.of(data).filter(e -> e.contains(e1) && !e.equalsIgnoreCase(e1)).count()>0;
        }).collect(Collectors.toList());

        System.out.println(result);
    }

}
