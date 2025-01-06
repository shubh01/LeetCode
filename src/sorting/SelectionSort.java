package sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] data = new int[]{5,4,3,2,1,100,90,80,70,60,50,40,30,20,10};//{65,25,2,1,11};
        int min =0;

        stableSelectionSort(data);
        // unstable selection sort
        for(int i=0;i<data.length;i++){
            min =i;
            for(int j=i+1;j<data.length;j++){
                if(data[min]>data[j]){
                    int temp = data[min];
                    data[min]=data[j];
                    data[j]=temp;
                }
            }
        }
        Arrays.stream(data).forEach(e -> System.out.println(e));
    }

    private static void stableSelectionSort(int[] data){
        int min =0;
        for(int i=0;i<data.length;i++){
            min = i;
            for(int j=i+1;j<data.length;j++){
                if(data[min]>data[j]){
                    min=j;
                }
            }

            int key = data[min];

            while (min>i){
                data[min]=data[min-1];
                min--;
            }
            data[i]=key;
        }
    }




}
