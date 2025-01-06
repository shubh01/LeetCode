package leetcode;

public class HashDividedString {

    public static void main(String[] args) {

        String source ="abcd";
        int k = 2;

        String s1 = source.substring(0,k);
        String s2 = source.substring(k,source.length());
        String result = "";
        if(s1 != null && !s1.isEmpty())
            result +=getHash(s1);
        if(s2 != null && !s2.isEmpty())
            result +=getHash(s2);

        System.out.println(result);
    }

    private static char getHash(String s){
        char[] sA = s.toCharArray();
        int i=97;
        int result = 0;
        for(char a:sA){
            result+= (int) a - i;
        }
        result = result%26;
        return (char) ((char) result+97);
    }

}
