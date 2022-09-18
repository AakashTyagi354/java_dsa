package stacks;

import java.util.Stack;

public class stock_span_problem {
    public static void stockSpan(int stock[], int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for(int i = 1;i<stock.length;i++){
            int currPrice = stock[i];

            // removing all the element smaller then current price i.e pre high;
            while(!s.isEmpty() && currPrice > stock[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }else{
                int prevHigh = s.peek();
                span[i] = i-prevHigh;
            }

            s.push(i);


        }

        // iterating throug span array;

        for(int i = 0;i< span.length;i++){
            System.out.print(span[i] + " ");
        }
    }
    public static void main(String[] args) {
        int stock[] = {100,80,60,70,60,85,100};
        int span[] =  new int[stock.length];
        stockSpan(stock,span);


    }
}
