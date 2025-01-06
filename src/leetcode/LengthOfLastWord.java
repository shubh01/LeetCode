package leetcode;

public class LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }

    public static int lengthOfLastWord(String s) {

        String[] data=s.trim().split(" ");
        return data[data.length-1].trim().length();
    }

}
