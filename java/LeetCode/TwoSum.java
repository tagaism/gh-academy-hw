package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {2, 7, 11, 15}, 9)));
    }

    private static int[] solution(int[] arr, int sum) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            int comp = sum - arr[i];
            if(m.containsKey(comp)) {
                return new int[]{m.get(comp), i};
            }
            m.put(arr[i], i);
        }
        return new int[] {};
    }
}
