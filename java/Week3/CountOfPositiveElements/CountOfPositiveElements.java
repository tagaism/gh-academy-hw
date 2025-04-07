// package Week3.CountOfPositiveElements;

import java.util.Scanner;

public class CountOfPositiveElements {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();
        int[] arr = new int[arrLength];
    
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    
        int counter = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                counter++;
            }
        }
        System.out.println(counter);
        sc.close();
    }
    
    
}
