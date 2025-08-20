package LeetCode;

public class ProductArrayExceptSelf {
    public static void main(String[] arsgs) {
        int[] arr = new int[]{4, 3, 2, 1, 2};
        for(int i : solution(arr)) {
            System.out.printf("%d, ", i);
        }
        System.err.println();
    }

    /**
     * Given an array of integers, return a new array where each element at index i is the product of all the numbers in the original array except the one at i.
     *
     * The approach involves calculating prefix and suffix products.  The prefix product array stores the product of all elements up to each index.
     * The suffix product array stores the product of all elements from each index to the end.  The result array is then constructed by multiplying the prefix product
     * before the index with the suffix product after the index.  Special handling is needed for the first and last elements.
     *
     * @param nums The input array of integers.
     * @return A new array where each element is the product of all numbers in the input array except the number at that index.
     */
    private static int[] solution(int[] nums) {
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
