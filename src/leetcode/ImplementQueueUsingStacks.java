package leetcode;

import java.util.ArrayList;

public class ImplementQueueUsingStacks {

    ArrayList<Integer> stack = new ArrayList<>();

    public static void main(String[] args) {



    }

    public void push(int x) {
        stack.add(x);
    }

    public int pop() {
        Integer element = stack.get(0);
        stack.remove(stack.get(0));
        return element;
    }

    public int peek() {
        return stack.get(0);
    }

    public boolean empty() {
        return stack.isEmpty();
    }

}
