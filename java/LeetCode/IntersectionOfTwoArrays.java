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

        System.out.println(Arrays.toString(solution(nums1, nums2)));
    }
    public static int[] solution(int[] nums1, int[] nums2) {
        Set<Integer> n1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        for(int i : nums1) {
            if(!n1.contains(i)) {
                n1.add(i);
            }
        }
        for(int i : nums2) {
            if(n1.contains(i)) {
                intersection.add(i);
            }
        }
        int[] res = new int[intersection.size()];
        int idx = 0;
        for(int i : intersection) {
            res[idx++] = i;
        }
        return res;
    }
}
