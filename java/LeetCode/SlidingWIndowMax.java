package LeetCode;

import java.util.Arrays;

public class SlidingWIndowMax {
    public static void main(String[] args) {
        
    }

    private int[] solution(int[] nums, int k) {
        int n = nums.length;
        int sqrt = (int) Math.ceil(Math.sqrt(n));
        int[] blocks = new int[sqrt];
        Arrays.fill(blocks, Integer.MIN_VALUE);
        for(int i = 0; i < n; i++) {
            int idx = i / sqrt;
            blocks[idx] = Math.max(blocks[i], nums[i]);
        }

        int[] result = new int[n - k + 1];
        for(int i = 0; i < result.length; i++) {
            int l = i;
            int r = i + k - 1;
            int currMax = Integer.MIN_VALUE;
            for(int j = i; j <= r; j++) {
                if(j % sqrt == 0 && j + sqrt - 1 <= r) {
                    int idx = i / sqrt;
                    currMax = Math.max(currMax, blocks[idx]);
                    j += sqrt;
                } else {
                    currMax = Math.max(currMax, nums[j]);
                    j++;
                }
            }
            result[i] = currMax;
        }
        return result;
    }
}
