package LeetCode;

import java.util.ArrayList;

public class SummaryRanges {
    public static void main(String[] args) {

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
