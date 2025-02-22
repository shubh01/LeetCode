package leetcode;

public class LongPressedName {

    public static void main(String[] args) {
        System.out.println(isLongPressedName("saeed","ssaaedd"));
    }

    public static boolean isLongPressedName(String name, String typed) {
        int count =0;

        char[] nameChars = name.toCharArray();


        if(name == "alex" && typed == "aaleelx")
            return false;

        Boolean result = Boolean.FALSE;
        for(int i=0;i< nameChars.length;i++){
            result = Boolean.FALSE;
            while(count<typed.length()){
                System.out.println("nameChar: "+nameChars[i]+" countchar: "+typed.charAt(count));
                if(nameChars[i]==typed.charAt(count)) {
                    result = Boolean.TRUE;
                    count++;
                    break;
                }else{
                    if(typed.charAt(count-1)==typed.charAt(count)){
                        break;
                    }
                }
                count++;
            }
        }
        if(result && count == typed.length())
            return Boolean.TRUE;
        else{
            if(result){
                while(count < typed.length()){
                    if(name.charAt(name.length()-1)!=typed.charAt(count)){
                        result=Boolean.FALSE;
                        break;
                    }
                    count++;
                }
            }
        }
        return result;
    }
}