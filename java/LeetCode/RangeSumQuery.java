package LeetCode;

/**
 * The {@code RangeSumQuery} class provides efficient range sum queries on an integer array.
 * It uses a prefix sum array to allow constant time queries for the sum of elements between two indices.
 *
 * <p>Example usage:
 * <pre>
 *     int[] nums = {1, 2, 3, 4, 5};
 *     RangeSumQuery rsq = new RangeSumQuery(nums);
 *     int sum = rsq.sumRange(1, 3); // Returns the sum of elements from index 1 to 3 (inclusive)
 * </pre>
 *
 * <p>Time Complexity:
 * <ul>
 *   <li>Construction: O(n), where n is the length of the input array.</li>
 *   <li>sumRange query: O(1).</li>
 * </ul>
 */
public class RangeSumQuery {
    private int[] prefixSum;
    RangeSumQuery(int[] sum) {
        prefixSum = new int[sum.length];
        prefixSum[0] = sum[0];
        for(int i = 1; i < sum.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + sum[i];
        }
    }

    public int sumRange(int l, int r) {
        if(l == 0) {
            return prefixSum[r];
        }
        return prefixSum[r] - prefixSum[l - 1];
    }
}
