package leetcode;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {

        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));

    }

    public static int maxProfit(int[] prices) {

        int result =0;
        if(prices.length ==0 || prices.length == 1)
            return result;

        int min =prices[0];

        for(int i=0;i<prices.length;i++){
            if(min>prices[i]){
                min = prices[i];
            }
            if(prices[i]-min>result){
                result = prices[i]-min;
            }
        }
        return result;

    }

}
