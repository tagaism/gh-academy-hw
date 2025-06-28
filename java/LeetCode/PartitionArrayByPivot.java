package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class PartitionArrayByPivot {
    public static void main(String[] args) {
        int[] arr = new int[] {9,12,5,10,14,3,10};
        System.out.println(Arrays.toString(solution(arr, 10)));
    }
    private static int[] solution(int[] nums, int p) {
        int[] res = new int[nums.length];
        int i = 0;
        int pc = 0;
        for(int n : nums) {
            if(n < p) {
                res[i++] = n;
            } else if(n == p) {
                pc++;
            }
        }
        while(pc > 0) {
            res[i++] = p;
            pc--;
        }
        for(int n : nums) {
            if(n > p) {
                res[i++] = n;
            }
        }
        return res;
    }
}
