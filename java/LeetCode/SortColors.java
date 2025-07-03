package LeetCode;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = new int[] {2,0,2,1,1,0};
        solution(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void solution(int[] nums) {
        int z = 0;
        int o = 0;
        int t = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                z++;
            }
            if(nums[i] == 1) {
                o++;
            }
            if(nums[i] == 2) {
                t++;
            }
        }
        int i = 0;
        while(z-- > 0) {
            nums[i++] = 0;
        }
        while(o-- > 0) {
            nums[i++] = 0;
        }
        while(t-- > 0) {
            nums[i++] = 0;
        }
    }
}
