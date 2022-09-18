package stacks;

import java.util.Stack;

public class reverse_stack {
    public static void reverseAStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseAStack(s);
        s.push(top);
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        reverseAStack(s);


    }
}
