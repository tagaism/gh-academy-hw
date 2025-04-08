// package Week3.FindMaxElementInArray;

import java.util.Scanner;

public class FindMaxElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for(int i = 0; i < l; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        sc.close();
    }
}
