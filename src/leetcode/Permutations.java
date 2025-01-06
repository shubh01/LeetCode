package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {


    private static ArrayList<List<String>> result = new ArrayList<>();

    public static void main(String[] args) {
        helper(new String[]{"a","b","c"},0);
        System.out.println(result);
        System.out.println(result.size());

    }


    private static void  helper(String[] data, int i){

        if(i == data.length){
            String[] tmpD = Arrays.copyOf(data,data.length);
            result.add(Arrays.asList(tmpD));
            return;
        }

        for(int j=i;j<data.length;j++){
            data = swap(i,j,data);
            helper(data,i+1);
            data = swap(i,j,data);
        }
    }

    private static String[] swap(int i,int j, String[] data){
        String tmp = data[i];
        data[i]= data[j];
        data[j]= tmp;
        return data;
    }


}
