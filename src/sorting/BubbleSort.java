package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] data = { 64, 34, 25, 12, 22, 11, 90 };//new int[]{65,25,2,1,11};

        for(int i=0;i<data.length;i++){
            for(int j=1;j<data.length;j++){
                if(data[j-1]>data[j]){
                    int temp = data[j];
                    data[j]=data[j-1];
                    data[j-1]=temp;
                }
            }
        }

        Arrays.stream(data).forEach(e -> System.out.println(e));

    }

}
