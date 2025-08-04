package LeetCode;

import java.util.HashMap;

public class SubarraySum {
    public static void main(String[] args) {

    }

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
