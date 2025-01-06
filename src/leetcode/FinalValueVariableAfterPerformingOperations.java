package leetcode;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class FinalValueVariableAfterPerformingOperations {

    public static void main(String[] args) {

        System.out.println(operation(new String[]{"--X","X++","X++"}));

    }

    private static int operation(String[] operations){

        AtomicInteger result = new AtomicInteger();

        Arrays.stream(operations).forEach(e-> {

            if(e.contains("+")){
                result.addAndGet(1);
            }else{
                result.addAndGet(-1);
            }
        });

        return result.get();
    }

}
