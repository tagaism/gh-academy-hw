package LeetCode;

public class ProductArrayExceptSelf {
    public static void main(String[] arsgs) {

    }

    private int[] solution(int[] nums) {
        int n = nums.length;
        int[] prefMult = new int[n];
        prefMult[0] = nums[0];
        for(int i = 1; i < n; i++) {
            prefMult[i] = prefMult[i - 1] * nums[i];
        }

        int[] suffMult = new int[n];
        suffMult[n - 1] = nums[n - 1];
        for(int i = n - 2; i >= 0; i--) {
            suffMult[i] = suffMult[i + 1] * nums[i];
        }

        // [1, 2, 3, 4]
        //p[1,  2, 6,24]
        //s[24,24,12, 4]
        // [24,      6]


        //a[24,12, 8, 6]

        int[] ans = new int[n];
        ans[0] = suffMult[1];
        ans[n - 1] = prefMult[n - 2];
        for(int i = 1; i < n - 1; i++) {
            ans[i] = prefMult[i - 1] * suffMult[i + 1];
        }
        return ans;
    }
}
