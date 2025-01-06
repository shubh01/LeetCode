package impDs;

import java.util.ArrayList;
import java.util.List;

public class AllSubStrings {

    public static void main(String[] args) {
        allSubStrings("abc");
    }


    private static void allSubStrings(String source){
        List<String> result = new ArrayList<>();
        for(int i=0;i<source.length();i++){
            for(int j=i+1;j<=source.length();j++){
                result.add(source.substring(i,j));
            }
        }
        System.out.println(result);
    }

}
