package leetcode;

import java.util.Arrays;
import java.util.stream.Stream;

public class CanPlaceFlowers {

    public static void main(String[] args) {

        int[] flowerbed = new int[]{1,0,0,0,1};
        int n =1;

        int length = flowerbed.length;

        int max =0;

        if(length%2 ==0)
        {
            max = length/2;
        }else {

            if(flowerbed[0] == 0)
                max = length/2;
            else
                max= length/2+1;
        }

        System.out.println("max: "+max);

        long count = Arrays.stream(flowerbed).filter(e -> e==1).count();

        if(count + n<= max)
            System.out.println(Boolean.TRUE);
        else System.out.println(Boolean.FALSE);



    }

}
