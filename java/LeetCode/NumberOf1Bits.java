package LeetCode;

public class NumberOf1Bits {
    public static void main(String[] args) {
        System.out.println(solution(11));
    }
    private static int solution(int n) {
        //1011
        // int count = 0;
        // for(int i = 0; i < 32; i++) {
        //     int bm = 1 << i;
        //     System.out.printf("%d ", bm);
        //     if((n & bm) > 0) {
        //         count++;
        //     }

        // }
        // return count; Zamira's variant
        // int res = 0;
        // while(n > 0) {
        //     n = n & (n - 1);
        //     res++;
        // }
        // return res;

        int res = 0; 
        while(n > 0) {
            if(n % 2 == 1) {
                res++;
            }
            n /= 2;
        }
        return res;

    }
}
