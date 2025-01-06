package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> data = new ArrayList<>();
        List<Integer> oldList = new ArrayList<>();
        if(numRows == 0)
            return data;

        if(numRows >= 1)
        {
            List integers = new ArrayList();
            integers.add(1);
            data.add(integers);
            oldList = integers;
        }

        if(numRows >= 2){
            List integers = new ArrayList();
            integers.add(1);
            integers.add(1);
            data.add(integers);
            oldList = integers;
        }

        if(numRows>=3){
            for(int i= 3; i<=numRows;i++){
                List<Integer> tempList = new ArrayList<>();
                tempList.add(1);
                for(int j=0;j<oldList.size()-1;j++){
                    int temp = oldList.get(j)+oldList.get(j+1);
                    tempList.add(temp);
                }
                tempList.add(1);
                oldList=tempList;
                data.add(tempList);
            }
        }

        return data;
    }

}
