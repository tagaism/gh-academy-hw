package LeetCode;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotate(arr, 26);
        System.out.println(Arrays.toString(arr));

    }
    public static void rotate(int[] nums, int k) {
        // k = 3
        //       
        //[7,1,2,3,4,5,6]
        k = k % nums.length;
        if(nums.length > 1) {
            reverse(nums, 0, nums.length - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, nums.length - 1);
        }
    }
    public static void reverse(int[] arr, int l, int r) {
        while(l < r) {
            int t = arr[r];
            arr[r] = arr[l];
            arr[l] = t;
            l++;
            r--;
        }
    }
}
