package LeetCode;
public class SquaredOfSortedArray {
    public static void main(String[] args) {

    }
    private static int[] solution(int[] nums) {
        int[] res = new int[nums.length];
        int l = 0;
        int r = nums.length - 1;
        for(int i = nums.length - 1; i >= 0; i++) {
            if(Math.abs(nums[l]) > Math.abs(nums[r])) {
                res[i] = nums[l] * nums[l];
                l++;
            } else {
                res[i] = nums[r] * nums[r];
                r--;
            }
        }
        return nums;
    }
}