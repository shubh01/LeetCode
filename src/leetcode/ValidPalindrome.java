package leetcode;

public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome("aaa"));
        System.out.println(isPalindrome("a"));
        System.out.println(isPalindrome("\"Suit no regrets.\" A motto, Master Gerontius."));
    }

    public static boolean isPalindrome(String s) {
        boolean result = true;
        if(s.isEmpty())
            return result;
        s=s.toLowerCase();
        int i= 0, j=s.length()-1;

        if(s.length()==2){

            if(!Character.isLetterOrDigit(s.charAt(0)))
                return true;
            if(!Character.isLetterOrDigit(s.charAt(1)))
                return true;

            return s.charAt(0)==s.charAt(1);
        }

        while(i!=j && j>0 && i<s.length()){
//            System.out.println("i: "+i+" j: "+j+" "+s.charAt(i)+" -- "+s.charAt(j));
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
                continue;
            }
            if(s.charAt(i)!=s.charAt(j)){
                result = false;
                break;
            }
            i+=1;
            j-=1;
        }
        return result;
    }

}
