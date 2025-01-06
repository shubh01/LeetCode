package leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class SumOfSubArrayMinimums {

    public static void main(String[] args) {
        int[] a = new int[]{3,1,2,4};
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        subArrays(a,0,0,list);


/*        ArrayList<Integer> singleList = (ArrayList<Integer>) list.stream().flatMap(Collection::stream).collect(Collectors.toList());
        Integer result = singleList.stream().mapToInt(i->i.intValue()).sum();*/
        int result =0;
        for(ArrayList<Integer> data : list){
            result+=data.get(0).intValue();
        }

        System.out.println(result);
    }

    private static void subArrays(int[] a,int start, int end,ArrayList<ArrayList<Integer>> list){
        if(end == a.length){
            return;
        }
        else if(start>end){
            subArrays(a,0,end+1,list);
        }else {
            ArrayList<Integer> data = new ArrayList<>();
            for (int i=start;i<end;i++) {
                if(data.size()<=0 || data.get(0)>a[i]) {
                    data.clear();
                    data.add(0, a[i]);
                }
            }
            if(data.size()<=0 || data.get(0)>a[end]) {
                data.clear();
                data.add(0, a[end]);
            }
            list.add(data);
            subArrays(a,start+1,end,list);
        }
        return;
    }

}
