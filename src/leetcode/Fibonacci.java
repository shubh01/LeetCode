package leetcode;

public class Fibonacci {

    public static void main(String[] args) {
        int a=0,b=1;
        while(true){
            int temp =b;
            b=a+b;
            a=temp;
            System.out.println(b);
        }

    }

}
