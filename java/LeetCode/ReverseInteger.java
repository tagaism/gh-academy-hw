package LeetCode;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(solution(1534236469));
    }
    private static int solution(int x) {
        int res = 0;
        int sign = x / Math.abs(x);
        while(x > 0) {
            int t = x % 10;
            res += t;
            x /= 10;
            if(x > 0) {
                res *= 10;
            }
        }
        return res * sign;
    }
}
