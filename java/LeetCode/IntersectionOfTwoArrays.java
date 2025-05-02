package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int s = sc.nextInt();
        int[] nums1 = new int[l];
        int[] nums2 = new int[s];
        for(int i = 0; i < l; i++) {
            nums1[i] = sc.nextInt();
        }
        for(int i = 0; i < l; i++) {
            nums2[i] = sc.nextInt();
        }
        sc.close();
        // ALWAYS BE PAY ATTENTION ON CONSTRAINS!!!!!!!!
        System.out.println(Arrays.toString(solution(nums1, nums2)));
    }
    public static int[] solution(int[] nums1, int[] nums2) {
        int[] seen = new int[1001];
        for(int i : nums1) {
            seen[i] = 1;
        }
        int counter = 0;
        for(int i : nums2) {
            if(seen[i] == 1) {
                seen[i] = 2;
                counter++;
            }
        }
        int[] res = new int[counter];
        int idx = 0;
        for(int i : nums2) {
            if(seen[i] == 2) {
                res[idx++] = i;
                seen[i] = 1;
            }
        }
        return res;
    }
}
