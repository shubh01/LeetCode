package leetcode;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("]"));
    }
    public static boolean isValid(String s) {

        Integer[] stack = new Integer[s.length()];
        int j=0;
        int i=0;
        Boolean isValid = Boolean.TRUE;
        while(i<s.length()){
            if(s.charAt(i)=='('){
                stack[j]=-1;
                j+=1;
            }
            if(s.charAt(i)=='{'){
                stack[j]=-2;
                j+=1;
            }
            if(s.charAt(i)=='['){
                stack[j]=-3;
                j+=1;
            }if(s.charAt(i)==')'){
                j-=1;
                if(j>=0 && stack[j]==-1){
                    stack[j]=0;
                }else{
                    isValid = Boolean.FALSE;
                    break;
                }
            }
            if(s.charAt(i)=='}'){
                j-=1;
                if(j>=0 && stack[j]==-2){
                    stack[j]=0;
                }else{
                    isValid = Boolean.FALSE;
                    break;
                }
            }
            if(s.charAt(i)==']'){
                j-=1;
                if(j>=0 && stack[j]==-3){
                    stack[j]=0;
                }else{
                    isValid = Boolean.FALSE;
                    break;
                }
            }
            i++;
        }
        if(stack[0]!=null && stack[0]==0 && isValid)
            return true;
        return false;
    }

}
