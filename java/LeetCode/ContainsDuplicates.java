package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];
        for(int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(solution(arr));
        System.out.println(Arrays.toString(arr));
    }

    public static boolean solution(int[] arr) {
        HashSet<Integer> s = new HashSet<>();
        for(int i = 0; i < arr.length; i++) {
            if(s.contains(arr[i])) {
                return true;
            } else {
                s.add(arr[i]);
            }
        }
        return false;
    }
}
