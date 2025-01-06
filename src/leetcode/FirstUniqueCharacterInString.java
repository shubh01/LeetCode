package leetcode;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class FirstUniqueCharacterInString {

    public static void main(String[] args) {

        String data = "leetcode";

        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        for(int i=0;i<data.length();i++){
            Character temp = data.charAt(i);
            if(map.containsKey(temp)){
                map.put(temp,map.get(temp)+1);
            }else{
                map.put(temp,1);
            }
        }

        Optional<Map.Entry<Character, Integer>> result = map.entrySet().stream().filter(e-> e.getValue()==1).findFirst();

        if(result.isPresent())
            System.out.println(data.indexOf(result.get().getKey()));
        else System.out.println(-1);

/*        int[] dataA = new int[26];

        int base=97;
        for(int i=0;i<data.length();i++){
            char temp = data.charAt(i);
            int index = temp-base;
            if(dataA[index] != 0){
                dataA[index]= dataA[index]+1;
            }else{
                dataA[index] =1;
            }
        }

        int result = -1;
        for (int j=0;j<dataA.length;j++){
            if(dataA[j]==1){
                result=j;
                break;
            }
        }

        if(result != -1){
            result+=97;
            System.out.println((char)(result));
        }else System.out.println(result);*/

    }

}
