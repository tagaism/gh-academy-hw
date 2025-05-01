package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];
        for(int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int res = solution(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(res);
    }

    public static int solution(int[] arr) {
        // two pointers method.
        int j = 1;
        for(int i = 1; i < arr.length; i ++) {
            if(arr[i] != arr[i-1]) {
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }
}
