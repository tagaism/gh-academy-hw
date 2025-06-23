package LeetCode;

import java.util.Arrays;

public class ReverseBit {
    public static void main(String[] args) {
        System.out.println(solution(43261596));
    }

    private static int solution(int n) {
        String strBit = Integer.toBinaryString(n);
        System.out.println(strBit);
        int l = 0;
        int r = strBit.length() - 1;
        char[] charr = strBit.toCharArray();
        while(l < r) {
            char temp = charr[l];
            charr[l] = charr[r];
            charr[r] = temp;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(charr));
        return Integer.parseInt(new String(charr), 2);
    }
}
