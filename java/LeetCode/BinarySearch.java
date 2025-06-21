package LeetCode;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[] {1, 3, 5, 6, 10, 12, 14};
        System.out.println(solution(nums, 6, 0, nums.length - 1));
    }
    private static int solution(int[] numss, int tar, int l, int r) {
        if (l > r) {
            return -1;
        }
        int m = (r + l) / 2;
        if(numss[m] == tar) {
            return m;
        }
        if(numss[m] < tar) {
            l = m + 1;
        }
        if(numss[m] > tar) {
            r = m - 1;
        }
        return solution(numss, tar, l, r);
    }
}
