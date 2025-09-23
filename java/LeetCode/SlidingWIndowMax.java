package LeetCode;

import java.util.Arrays;

public class SlidingWIndowMax {
    public static void main(String[] args) {
    }

    /**
        * Given an array of integers `nums` and an integer `k`, find the maximum value in each sliding window of size `k`.
        *
        * The algorithm divides the input array into blocks of size sqrt(n), where n is the length of the array.
        * It precomputes the maximum value in each block.
        * Then, for each sliding window, it finds the maximum value by considering the blocks that are fully contained in the window,
        * and the elements at the boundaries of the window.
        *
        * @param nums The input array of integers.
        * @param k The size of the sliding window.
        * @return An array of integers, where each element is the maximum value in the corresponding sliding window.
        *
        * Example:
        * ----------
        * Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
        * Output: [3,3,5,5,6,7]
        * Explanation:
        * Window position                Max
        * ---------------               -----
        * [1  3  -1] -3  5  3  6  7       3
        *  1 [3  -1  -3] 5  3  6  7       3
        *  1  3 [-1  -3  5] 3  6  7       5
        *  1  3  -1 [-3  5  3] 6  7       5
        *  1  3  -1  -3 [5  3  6] 7       6
        *  1  3  -1  -3  5 [3  6  7]      7
        */
    private static int[] solution(int[] nums, int k) {
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
