/**
 * Utility class for finding pairs of integers from two arrays that sum up to a target value.
 */
 
/**
 * Finds all pairs of integers where one element is from {@code arr2} and the other is from {@code arr1},
 * such that their sum equals the specified {@code target}.
 *
 * @param arr1 the first array of integers
 * @param arr2 the second array of integers
 * @param target the target sum for the pairs
 * @return an {@code ArrayList} of integer arrays, where each array contains a pair of integers [c, compl]
 *         such that {@code c} is from {@code arr2}, {@code compl} is from {@code arr1}, and {@code c + compl == target}
 */
package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindPairs {
    
    public static ArrayList<int[]> solution(int[] arr1, int[] arr2, int target) {
        Set<Integer> set = new HashSet<>();
        for(int c : arr1) {
            set.add(c);
        }

        ArrayList<int[]> pairs = new ArrayList<>();
        for(int c : arr2) {
            int compl = target - c;
            if(set.contains(compl)) {
                pairs.add(new int[]{c, compl});
            }
        }
        return pairs;
    }
}
