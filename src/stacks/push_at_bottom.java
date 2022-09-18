package stacks;

import java.util.Stack;

public class push_at_bottom {
    public static void pussAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pussAtBottom(s,data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        pussAtBottom(s,40);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
