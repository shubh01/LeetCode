package leetcode;

public class StackByArray {


    static int[] push = new int[10];

    static int[] pop = new int[10];

    static int counter =0;

    public static void main(String[] args) {

        pushOp(1);
        pushOp(2);
        pushOp(3);
        pushOp(4);
        pushOp(5);
        pushOp(6);

        System.out.println(popOp());

        System.out.println(popOp());

        System.out.println(popOp());

        System.out.println(popOp());

        System.out.println(popOp());


        System.out.println(push);

    }


    static void pushOp(int data){
        push[counter]=data;
        counter++;
    }

    static int popOp(){
        int temp=0;
        pop = new int[pop.length];
        for(int i=counter-1;i>=0;i--){
            pop[temp]=push[i];
            temp++;
            counter--;
        }
        push = new int[push.length];
        for(int i=temp-1;i>=1;i--){
            pushOp(pop[i]);
        }
        return pop[0];
    }

}
