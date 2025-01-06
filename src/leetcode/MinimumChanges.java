package leetcode;

public class MinimumChanges {

    public static void main(String[] args) {

        String s = "1001";
        int p1 = 0;
        int p2 = 2;
        int count =0;
        while(p1!=s.length()){
            String subString = s.substring(p1,p2);
            if(subString.charAt(0)!=subString.charAt(1))
                count++;
            p1+=2;
            p2+=2;
        }
        System.out.println(count);
    }

}
