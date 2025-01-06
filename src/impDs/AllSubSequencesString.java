package impDs;

import java.util.ArrayList;
import java.util.List;

public class AllSubSequencesString {

    public static void main(String[] args) {

        List<String> ans = new ArrayList<>();
        subSequence("abc",ans,"",0);
        System.out.println(ans);

    }

    private static void subSequence(String source, List<String> ans, String tmp, int start){

        if(start == source .length()){
            ans.add(new String(tmp));
            return;
        }
        tmp+= source.charAt(start);
        subSequence(source,ans,tmp,start+1);
        tmp=tmp.substring(0,tmp.length()-1);
        subSequence(source,ans,tmp,start+1);

    }

}
