package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
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
        HashSet<Integer> seen = new HashSet<>();
        for(int i = 0; i < nums1.length; i++) {
            for(int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j]) {
                    seen.add(nums1[i]);
                }
            }
        }
        return seen.stream().mapToInt(Integer::intValue).toArray();
    }
}
