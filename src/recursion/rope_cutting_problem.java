package recursion;

public class rope_cutting_problem {
    static int maxP(int n, int a , int b, int c){
        if(n == 0){
            return 0;
        }
        if(n < 0){
            return -1;
        }
        int res = Math.max(maxP(n-a,a,b,c),maxP(n-b,a,b,c));
        int result = Math.max(res,maxP(n-c,a,b,c));
        if(result == -1){
            return -1;
        }
        return result+1;
    }
    public static void main(String[] args) {
        int n = 23, a = 12, b = 9, c = 1;
        System.out.println(maxP(n,a,b,c));
    }
}
