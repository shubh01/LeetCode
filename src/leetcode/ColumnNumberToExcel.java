package leetcode;

public class ColumnNumberToExcel {

    public static void main(String[] args) {


        StringBuilder result = new StringBuilder();
        int input =52;
        while(input>26){
            int temp = (input-1)%26;
            System.out.println(temp);
            String tempStr = getTitle(temp);
            result.append(tempStr);
            input = (input-1)/26;
        }
        String tempStr = getTitle(input);
        result.append(tempStr);
        System.out.println(result.reverse());


    }


    private static String getTitle(int x){
        return String.valueOf((char)'A'+x);
    }


}
