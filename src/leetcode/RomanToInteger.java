package leetcode;

public class RomanToInteger {


    public static void main(String[] args) {
        String input = "DCXXI";//"III";//"MCMXCIV";
        int j=0;
        int result =0;
        for (int i=0;i<input.length();i++){
            j=i;
            if(input.charAt(i)=='I' || input.charAt(i)=='X' || input.charAt(i)=='C'){
                if(j+1<input.length()){
                    j++;
                    String data= input.substring(i, j + 1);
                    if(isCornerCase(data)) {
                        result += getNumberFromRoman(data);
                        i = j;
                    }else result+=getNumberFromRoman(String.valueOf(input.charAt(i)));
                }else{
                    result+=getNumberFromRoman(String.valueOf(input.charAt(i)));
                }
            }else{
                result+=getNumberFromRoman(String.valueOf(input.charAt(i)));
            }
        }
        System.out.println("result: "+result);

    }

    private static Boolean isCornerCase(String value){
        if(value.equals("IV") || value.equals("IX") || value.equals("XL") || value.equals("XC") || value.equals("CD") || value.equals("CM"))
            return Boolean.TRUE;
        return Boolean.FALSE;
    }

    private static int getNumberFromRoman(String value){
        System.out.println("value: "+value);
        switch(value){
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "IX":
                return 9;
            case "X":
                return 10;
            case "XL":
                return 40;
            case "L":
                return 50;
            case "XC":
                return 90;
            case "C":
                return 100;
            case "CD":
                return 400;
            case "D":
                return 500;
           case "CM":
                return 900;
            case "M":
                return 1000;
        }
        return 0;
    }



}
