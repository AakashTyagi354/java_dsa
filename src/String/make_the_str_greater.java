package String;

import java.util.Stack;

//https://leetcode.com/problems/make-the-string-great/

public class make_the_str_greater {
    public static String makeGood(String s){
        StringBuilder sc = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for(int i = 0;i<s.length();i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
                sc.append(s.charAt(i));
                continue;
            }
            if(Math.abs(stack.peek()-s.charAt(i))==32){
                stack.pop();
                sc.deleteCharAt(sc.length()-1);

            }else {
                stack.push(s.charAt(i));
                sc.append(s.charAt(i));
            }
        }
        return sc.toString();
    }
    public static void main(String[] args) {
         String s = "leEeetcode";
        System.out.println(makeGood(s));


    }
}
