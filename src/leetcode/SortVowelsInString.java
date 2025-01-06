package leetcode;

import java.util.ArrayList;
import java.util.Comparator;

public class SortVowelsInString {



    public static void main(String[] args) {
        String data = "lEetcOde";

        char[] dataA = data.toCharArray();

        ArrayList<Character> characters = new ArrayList<>();

        for(int i=0;i<dataA.length;i++){
            if(isVowel(dataA[i]))
                characters.add(dataA[i]);
        }

        sortVowels(characters);

        int index = 0;

        for(int i=0;i<dataA.length;i++){
            if(isVowel(dataA[i])){
             dataA[i]=characters.get(index);
             index++;
            }
        }

        System.out.println(String.valueOf(dataA));

    }


    private static Boolean isVowel(Character s){
        switch(s){
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' :
                return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }


    private static ArrayList<Character> sortVowels(ArrayList<Character> characters){

        characters.sort(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return Integer.compare(o1,o2);
            }
        });

        return characters;
    }

}
