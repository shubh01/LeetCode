package leetcode;

import java.util.stream.Stream;

public class TimeToCollectGarbage {

    public static void main(String[] args) {
        garbageCollection(new String[]{"G","P","GP","GG"}, new int[]{2,4,3});
    }

    public static int garbageCollection(String[] garbage, int[] travel) {


        int tM=0, tG=0,tP=0, result =0;

        Boolean isG = Boolean.FALSE;
        Boolean isM = Boolean.FALSE;
        Boolean isP = Boolean.FALSE;

        for(int i=0;i<garbage.length;i++){

            String temp = garbage[i];
            if(i != 0){
                tG+=travel[i-1];
                tM+=travel[i-1];
                tP+=travel[i-1];
            }
            if(temp.contains("G")){
                isG = Boolean.TRUE;
                Stream<Character> stream = temp.chars().mapToObj(e -> (char)e);
                tG+=stream.filter(e-> e.equals('G')).count();
                System.out.println("tG: "+tG);
            }
            if(temp.contains("M")){
                isM = Boolean.TRUE;
                Stream<Character> stream = temp.chars().mapToObj(e -> (char)e);
                tM+=stream.filter(e-> e.equals('M')).count();
                System.out.println("tM: "+tM);
            }
            if(temp.contains("P")){
                isP = Boolean.TRUE;
                Stream<Character> stream = temp.chars().mapToObj(e -> (char)e);
                tP+=stream.filter(e-> e.equals('P')).count();
                System.out.println("tP: "+tP);
            }
        }

        if(isM)
            result+=tM;
        if(isP)
            result+=tP;
        if(isG)
            result+=tG;

        System.out.println("tG: "+tG+" tP: "+tP+" tM: "+tM);

        return 0;
    }

}
