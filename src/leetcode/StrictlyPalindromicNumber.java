package leetcode;

public class StrictlyPalindromicNumber {

    public static void main(String[] args) {
        int n=4;
        Boolean result=true;
        for(int i=2;i<=n-2;i++){
            StringBuilder tmp = getBinary(n,i);
            System.out.println(tmp);
            result = tmp.toString().equals(tmp.reverse().toString())? true:false;
            if(!result)
                break;
        }
        System.out.println(result);


    }


    private static StringBuilder getBinary(int i,int n){
        StringBuilder result = new StringBuilder();
        while(i != 0){
            int j= i%n;
            i=i/n;
            result.append(j);
        }


        return result.reverse();
    }

}
