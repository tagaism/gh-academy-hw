package LeetCode;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,2,1,1,1,2,2,4,4,4,4,4,4,4,4,4,4}));
    }
    private static int solution(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 1) + 1);
            // if(map.containsKey(n)) {
            //     map.replace(n, map.get(n)+1);
            // } else {
            //     map.put(n, 1);
            // }
        }
        for(int n : map.keySet()) {
            if(map.get(n) > nums.length / 2) {
                return n;
            }
        }
        return 0;
    }
}
