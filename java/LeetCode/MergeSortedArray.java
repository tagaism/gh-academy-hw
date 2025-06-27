package LeetCode;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = new int[] {2, 5, 7, 0, 0, 0};
        int[] arr2 = new int[] {1, 4, 9};
        solution(arr1, 3, arr2, 3);
        System.out.println(Arrays.toString(arr1));
    }
    private static void solution(int[] nums1, int m, int[] nums2, int n) {
        if(nums1.length == 1 && nums1.length ==1) {
            nums1[0] = nums2[0];
        }
        m--;
        n--;
        int r = nums1.length - 1;
        while(m >= 0 && n >= 0) {
            nums1[r--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }
        while(n >= 0) {
            nums1[r--] = nums2[n--];
        }
    }
}
