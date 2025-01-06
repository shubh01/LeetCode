package sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int data[] =  { 12, 11, 13, 5, 6 };
        //{65,25,2,1,11};


        for(int i=1;i< data.length;i++){
            for(int j=i-1;j>=0;j--){
                if(data[j]>data[j+1]){
                    int temp = data[j];
                    data[j]=data[j+1];
                    data[j+1]=temp;
                }
            }
        }

        Arrays.stream(data).forEach(e -> System.out.println(e));

    }

}
