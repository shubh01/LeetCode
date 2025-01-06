package leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveAllBallsToEachBox {

    public static void main(String[] args) {
        String data = "001011";

//      Integer[] dataI = data.chars().mapToObj(value -> (int) value).toArray(Integer[]:: new);
      int[] dataI = data.chars().map(operand -> operand - '0').toArray();
      move(dataI);
    }


    private static void move(int[] data){

        int[] result = new int[data.length];


        for(int i=0;i< data.length;i++){
            int tmp = 0;
            for(int j= data.length -1 ;j>i;j--){
                if(data[j] == 1){
                    tmp+=j;
                    tmp-=i;
                }
            }
            int tmp2 = 0;
            for(int k=i;k>=0;k--){
                if(data[k] == 1){
                    tmp2+=1;
                }
            }
            System.out.println("tmp2: "+tmp2+" tmp: "+tmp);
            result[i]=tmp+tmp2;
        }

        Arrays.stream(result).forEach(e -> System.out.println(e));

    }

}
