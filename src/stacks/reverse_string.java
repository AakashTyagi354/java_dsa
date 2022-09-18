package stacks;

import java.util.Stack;

public class reverse_string {
    public static void reverseAStr(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;

        while (idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder res = new StringBuilder();

        while(!s.isEmpty()){
            char curr = s.pop();
            res.append(curr);

        }
        str = res.toString();
        System.out.println(str);
    }
    public static void main(String[] args) {
        String str = "aakash";
        reverseAStr(str);



    }
}
