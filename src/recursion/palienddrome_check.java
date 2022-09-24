package recursion;

public class palienddrome_check {
    static boolean isCheck(String str, int start, int end){
        if(start >= end){
            return true;
        }
        return (str.charAt(start) == str.charAt(end) &&
                isCheck(str,start+1,end-1)
                );
    }
    public static void main(String[] args) {
        String str = "abcba";
        int start = 0, end = str.length()-1;
        System.out.println(isCheck(str,start,end));
    }
}
