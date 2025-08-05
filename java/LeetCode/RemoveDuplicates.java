package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {

    }

    /**
     * Removes duplicate integers from the given list.
     *
     * @param nums the list of integers that may contain duplicates
     * @return a new list containing only unique integers from the input list, with no guaranteed order
     */
    public static List<Integer> solution(List<Integer> nums) {
        HashSet<Integer> set = new HashSet<>(nums);
        return new ArrayList<>(set);
    }
}
