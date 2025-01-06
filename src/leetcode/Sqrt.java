package leetcode;

public class Sqrt {

    public static void main(String[] args) {
        System.out.println(mySqrt(105));
    }

    public static int mySqrt(int x) {

        int mid=0;
        int low=0;
        int high=x;

        while(low<=high){
            System.out.println("mid: "+mid+" low: "+low+" high: "+high);

            mid = (high+low)/2;

            if((mid*mid)==x){
                return mid;
            }
            if((mid*mid)>x){
                high=mid-1;
            }else{
                low=mid+1;
            }

        }

        System.out.println("mid: "+mid+" low: "+low+" high: "+high);

        return 0;

    }

}
