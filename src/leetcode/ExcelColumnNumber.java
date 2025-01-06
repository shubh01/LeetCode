package leetcode;

public class ExcelColumnNumber {

    public static void main(String[] args) {
        int count =0;
        int result =0;
        String input = "AAD";

        for(int i=input.length()-1;i>=0;i--){
            char x = input.charAt(i);
            int temp = getTitle(x);
            System.out.println("x: "+x+" temp: "+temp);
            System.out.println("Math.pow(26,count): "+Math.pow(26,count));
            result+= Math.pow(26,count)*temp;
            count++;
        }
        System.out.println(result);
    }


    private static int getTitle(char x){
        switch (x){
            case 'A': return 1;
            case 'B': return 2;
            case 'C': return 3;
            case 'D': return 4;
            case 'E': return 5;
            case 'F': return 6;
            case 'G': return 7;
            case 'H': return 8;
            case 'I': return 9;
            case 'J': return 10;
            case 'K': return 11;
            case 'L': return 12;
            case 'M': return 13;
            case 'N': return 14;
            case 'O': return 15;
            case 'P': return 16;
            case 'Q': return 17;
            case 'R': return 18;
            case 'S': return 19;
            case 'T': return 20;
            case 'U': return 21;
            case 'V': return 22;
            case 'W': return 23;
            case 'X': return 24;
            case 'Y': return 25;
            case 'Z': return 26;
        }
        return 0;
    }


}
