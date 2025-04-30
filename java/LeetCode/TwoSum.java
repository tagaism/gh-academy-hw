package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];
        for(int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        sc.close();
        System.out.println(Arrays.toString(solution(arr, sum)));
    }

    private static int[] solution(int[] arr, int sum) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            int comp = sum - arr[i];
            if(m.containsKey(comp)) {

                return new int[]{m.get(comp), i};
            }
            m.put(arr[i], i);
            for(Integer i : m.keySet()) {
                System.out.println(i);
            };
        }
        return new int[] {};
    }
}
