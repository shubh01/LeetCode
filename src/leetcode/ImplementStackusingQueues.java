package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackusingQueues {

    Queue<Integer> pushQ = new LinkedList<>();
    Queue<Integer> popQ = new LinkedList<>();

    public static void main(String[] args) {



    }

    public void push(int x) {
        while(!pushQ.isEmpty()){
            popQ.add(pushQ.poll());
        }
        pushQ.add(x);
        while (!popQ.isEmpty()){
            pushQ.add(popQ.poll());
        }
    }

    public int pop() {
        return pushQ.poll();
    }

    public int top() {
        return pushQ.peek();
    }

    public boolean empty() {
        return pushQ.isEmpty();
    }


}
