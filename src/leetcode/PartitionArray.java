package leetcode;

import java.util.Arrays;

public class PartitionArray {

    public static void main(String[] args) {
        Arrays.stream(test(new int[]{9, 12, 5, 10, 14, 3, 10}, 10)).forEach(e-> System.out.println(e));
    }


    private static int[] test(int[] data, int pivot){

        int[] tmp = new int[data.length];
        int l=0;
        for(int i=0;i<data.length;i++){
            if(data[i]<pivot){
                tmp[l]=data[i];
                l++;
            }
        }
        for(int i=0;i<data.length;i++){
            if(data[i]==pivot){
                tmp[l]=data[i];
                l++;
            }
        }
        for(int i=0;i<data.length;i++){
            if(data[i]>pivot){
                tmp[l]=data[i];
                l++;
            }
        }
        return tmp;
    }

}
