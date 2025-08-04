package LeetCode;

import java.util.HashMap;

public class SubarraySum {
    public static void main(String[] args) {

    }

    /**
     * Finds the start and end indices of a contiguous subarray within the given array `nums`
     * whose elements sum up to the specified `target`.
     *
     * Uses a HashMap to store the cumulative sum up to each index and its corresponding index.
     * If the difference between the current cumulative sum and the target has been seen before,
     * it means the subarray between the previous index and the current index sums to the target.
     *
     * @param nums   the input array of integers
     * @param target the target sum to find in the subarray
     * @return       an array of two integers representing the start and end indices of the subarray;
     *               returns an empty array if no such subarray exists
     */
    public static int[] solution(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int currSum = 0;
        for(int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            if(map.containsKey(currSum - target)) {
                return new int[]{map.get(currSum - target) + 1, i};
            }
            map.put(currSum, i);
        }
        return new int[]{};
    }
}
