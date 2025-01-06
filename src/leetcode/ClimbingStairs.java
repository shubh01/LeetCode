package leetcode;

public class ClimbingStairs {

    public static void main(String[] args) {
        int a=0,b=1;
        int i=0;
        while(i<5){
            int temp =b;
            b=a+b;
            a=temp;
            System.out.println(b);
            i++;
        }
    }
}
