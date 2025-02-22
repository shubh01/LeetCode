package leetcode;

public class RemoveLetterToEqualizeFrequency {

    public static void main(String[] args) {
        String word = "aazz";
        int[] data = new int[26];
        for(int a:word.toCharArray()){
            int i= a-97;
            if(data[i]==0){
                data[i]=1;
            }else{
                data[i]+=1;
            }
        }
        boolean result = false;

        for(int a:word.toCharArray()){
            int i=a-97;
            int temp=data[i]-1;
            result = checkArray(word,i,temp,data);
            if(result == Boolean.TRUE)
                break;
        }

        System.out.println(result);
    }

    private static Boolean checkArray(String word,int i, int tmp, int[] data){
        Boolean result = Boolean.TRUE;
        int c = -1;
        for(int a:word.toCharArray()){
            int k=a-97;
            if(k==i && tmp ==0){
                continue;
            }
            if(c==-1)
                c=data[k];

            System.out.println("i "+i+" tmp: "+tmp+" c: "+c+" k: "+k+" data[k]: "+data[k]);


            if(tmp !=0){
                if(data[k] != tmp && (i!=k)) {
                    result = Boolean.FALSE;
                    break;
                }
            }else{
                if(data[k] != c) {
                    result = Boolean.FALSE;
                    break;
                }
            }
        }
        return result;
    }

}
