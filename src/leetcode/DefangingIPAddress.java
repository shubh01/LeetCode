package leetcode;

public class DefangingIPAddress {

    public static void main(String[] args) {

        String address = "1.1.1.1";

        String result = address.replace(".","[.]");

        System.out.println(result);

    }

}
