package LeetCode;

public class ReverseBits {
    public static void main(String[] args) {
        System.out.println(solution(1025));
    }

    private static int solution(int n) {
        int res = 0;
        //                                      i
        //0011 1001 0111 1000 0010 1001 0100 0010
        //
        System.out.println();

        for(int i = 0; i < 32; i++) {
            int bit = (n >> i) & 1;
            if(bit == 1) {
                System.out.printf("%d ", bit);
                res |= 1 << (31 - i);
            }
        }
        System.err.println();
        return res;
    }
}
