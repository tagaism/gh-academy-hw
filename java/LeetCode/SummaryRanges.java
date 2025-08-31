package LeetCode;

import java.util.ArrayList;

/**
 * Given a sorted integer array without duplicates, return the summary of its ranges.
 *
 * Example 1:
 *
 * Input: [0,1,2,4,5,7]
 * Output: ["0->2","4->5","7"]
 * Explanation: 0,1,2 form a continuous range; 4,5 form a continuous range.
 *
 * Example 2:
 *
 * Input: [0,2,3,4,6,8,9]
 * Output: ["0","2->4","6","8->9"]
 * Explanation: 2,3,4 form a continuous range; 8,9 form a continuous range.
 *
 * @param nums the sorted integer array
 * @return the summary of its ranges
 
 * Constraints:
 *
 * 0 <= nums.length <= 100
 * 0 <= nums[i] <= 10^9
 */
public class SummaryRanges {
    public static void main(String[] args) {
        int[] ar = new int[]{1, 2, 3, 6, 7, 8, 10, 11, 15};
        System.out.println(solution(ar));
    }

    public static ArrayList<String> solution(int[] nums) {

        ArrayList<String> res = new ArrayList<>();
        if(nums.length == 0) return res;
        if(nums.length == 1) {
            res.add(nums[0] + "");
        }

        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(nums[0]);
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] - nums[i - 1] == 1) {
                temp.add(nums[i]);
            } else {
                res.add(helper(temp));
                temp.clear();
                temp.add(nums[i]);
            }
        }
        res.add(helper(temp));
        return res;
    }

    private static String helper(ArrayList<Integer> arr) {
        if(arr.size() == 1) {
            return arr.get(0) + "";
        }
        return String.format("%d->%d", arr.get(0), arr.get(arr.size() - 1));
    }
}
