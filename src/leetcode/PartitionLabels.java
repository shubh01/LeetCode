package leetcode;

import java.util.*;

public class PartitionLabels {

    public static void main(String[] args) {
        partition("ababcbacadefegdehijhklij");
    }


    private static void partition(String data){

        HashMap<String, List<Integer>> map = new HashMap<>();
        Set<Integer> result = new HashSet<>();
        int min=-1;
        int max=-1;
        data.chars().forEach(e-> {
            if(!map.containsKey(String.valueOf(e))){
                List<Integer> dataList = new ArrayList<>();
                dataList.add(data.indexOf(e));
                dataList.add(data.lastIndexOf(e));
                map.put(String.valueOf(e),dataList);
            }
        });

        for(Map.Entry<String, List<Integer>> e:map.entrySet()){
            List<Integer> tmpList = e.getValue();
            if(min == -1)
                min= tmpList.get(0);
            if(max == -1)
                max= tmpList.get(1);
            for(Map.Entry<String, List<Integer>> entry2: map.entrySet()){
                List<Integer> tmpList2 = entry2.getValue();
                int minTmp =tmpList2.get(0);
                int maxTmp=tmpList2.get(1);

                if(max >minTmp && max<maxTmp){
                    max=maxTmp;
                }
                if(minTmp >max){
                    min = minTmp;
                    max = maxTmp;
                }
            }
            System.out.println("min: "+min+" max: "+max);
            result.add(max-min+1);
        }

        System.out.println(result);

    }

}
