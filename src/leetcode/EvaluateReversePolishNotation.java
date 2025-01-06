package leetcode;

import java.util.Stack;

public class EvaluateReversePolishNotation {

    public static void main(String[] args) {
        String operations = "+,-,*,/";

//        System.out.println(operations.contains("^"));

        System.out.println(evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));

    }


    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        String operations = "+,-,*,/";

        if(tokens.length==0)
            return 0;
        if(tokens.length==1)
            return Integer.valueOf(tokens[0]);

        for(String token:tokens){
            if(operations.contains(token)){
                int value1 = stack.pop();
                int value2 = stack.pop();
                int result = performOperation(value1,value2,token);
                stack.push(result);
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    private static int performOperation(int value1,int value2, String operation){
        switch (operation){
            case "+":
                return value1+value2;
            case "-":
                return value1-value2;
            case "*":
                return value1*value2;
            case "/":
                return value2/value1;
        }
        return 0;
    }

}
