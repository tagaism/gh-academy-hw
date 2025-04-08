// package Week3.SwapNeighboursInArray;

import java.util.Scanner;

public class SwapNeighboursInArray {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //t = 4
        //             i
        //[2, 1, 4, 3, 5]

        for(int i = 0; i < arr.length - 1; i = i+2){
            int t = arr[i + 1];
            arr[i + 1] = arr[i];
            arr[i] = t;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}