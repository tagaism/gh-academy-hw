package LeetCode;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = new int[]{0,23};
        solution(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void solution(int[] arr) {
        //     i
        // 1 3 12 0 0 0
        //            j
        int z = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                arr[z] = arr[i];
                z++;
            }
        }
        for(int i = z; i < arr.length; i++) {
            arr[i] = 0;
        }
    }
}
