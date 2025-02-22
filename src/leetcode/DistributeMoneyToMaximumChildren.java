package leetcode;

public class DistributeMoneyToMaximumChildren {

    public static void main(String[] args) {


        System.out.println(distMoney(20,3));


    }


    public static int distMoney(int money, int children) {
        if(money<children)
            return -1;

        if(money>200 || money<1){
            return -1;
        }

        if(children<2 || children>30)
            return -1;

        int count=0;

        while(children != 0 && money !=0){

            money = money-8;

            children-=1;

            if(children ==1 && money>8){
                count++;
                break;
            }

            if((money !=4 || children!= 1) && money>=children){
                count++;
            }else break;
        }


        return count;

    }

}
