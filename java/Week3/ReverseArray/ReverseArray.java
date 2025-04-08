// package Week3.ReverseArray;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //                j
        //[8, 7, 6, 2, 3, 1] t = 1
        // i
        int i = 0;
        int j = arr.length - 1;
        while(i < j) {
            int t = arr[j];
            arr[j] = arr[i];
            arr[i] = t;
            i++;
            j--;
        }
        for(int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        sc.close();
    }
}
