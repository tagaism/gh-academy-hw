// package Week3.PrintElementsOfEvenIndexes;

import java.util.Scanner;

public class PrintElementsOfEvenIndexes {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();
        int[] arr = new int[arrLength];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++) {
            if(i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}
