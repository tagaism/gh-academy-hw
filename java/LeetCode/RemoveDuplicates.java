package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {

    }

    public static List<Integer> solution(List<Integer> nums) {
        HashSet<Integer> set = new HashSet<>(nums);
        return new ArrayList<>(set);
    }
}
