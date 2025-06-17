package LeetCode;

public class NumberOf1Bits {
    public static void main(String[] args) {
        System.out.println(solution(11));
    }
    private static int solution(int n) {
        int res = 0;
        for(int i = 0; i < 31; i++) {
            int bitmask = 1 << i;
            if((bitmask & n) > 0) {
                res++;
            }
        }
        return res;
    }
}
