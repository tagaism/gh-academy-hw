package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class TopKFrequentElement {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution()));
    }

    private static int[] solution() {
        int[] arr = new int[] {1,1,1,2,2,3};
        int k = 2;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i : arr) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
    }
}
