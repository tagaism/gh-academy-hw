// package Week3.PrintEvenElements;

import java.util.Scanner;

public class PrintEvenElements {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();
        int[] arr = new int[arrLength];
    
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
    
}



