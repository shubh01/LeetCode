package leetcode;

import java.util.Arrays;
import java.util.stream.Stream;

public class NumberOfLaserBeamInBank {

    public static void main(String[] args) {

        String[] a = new String[] {"000","111","000"};

        int result =0;

        for(int i=0;i<a.length;i++){
            Boolean hasDevice = hasDevice(a[i]);
            long deviceCount = deviceCount(a[i]);
            if(hasDevice && i<a.length-1){
                for(int j=i+1;j< a.length;j++){
                    Boolean hasDevice1 = hasDevice(a[j]);
                    long deviceCount1 = deviceCount(a[j]);
                    if(hasDevice1){
//                        System.out.println("inter result: "+deviceCount*deviceCount1+" i: "+i+" j: "+j);
                        result+= (deviceCount*deviceCount1);
                        break;
                    }
                }
            }
        }
        System.out.println(result);
    }

    private static Boolean hasDevice(String data){
        if(data.contains("1"))
            return  Boolean.TRUE;
        return Boolean.FALSE;
    }

    private static long deviceCount(String data){
        if(data.contains("1")){
           Stream<Character> charStream = data.chars().mapToObj(i -> (char)i);
           return charStream.filter(e -> e=='1').count();
        }
        return 0;
    }

}
