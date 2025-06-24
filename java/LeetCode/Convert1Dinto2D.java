package LeetCode;

import java.util.Arrays;

public class Convert1Dinto2D {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(solution(nums, 2, 3)));
    }
    private static int[][] solution(int[] arr, int m, int n) {
        if(arr.length != m * n) {
            return new int[][]{};
        }
        int[][] res = new int[m][n];
        for(int i = 0; i < arr.length; i++) {
            int r = i / n;
            int c = i % n;
            res[r][c] = arr[i];
        }
        return res;
    }
}
