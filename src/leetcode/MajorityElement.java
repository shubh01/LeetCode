package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MajorityElement {

    public static void main(String[] args) {

        int[] data = new int[]{3,2,3};

        int repeatCount = (int) Math.ceil((double) data.length/2);

        System.out.println(repeatCount);
        Map<Integer,Integer> dataFreq = new HashMap<>();

        Arrays.stream(data).forEach(e-> {
            if(dataFreq.containsKey(e)){
                dataFreq.put(e,dataFreq.get(e)+1);
            }else{
                dataFreq.put(e,1);
            }
        });

        Integer result = dataFreq.entrySet().stream().filter(e-> e.getValue()>=repeatCount).findFirst().get().getKey();
        System.out.println(result);

    }

}
