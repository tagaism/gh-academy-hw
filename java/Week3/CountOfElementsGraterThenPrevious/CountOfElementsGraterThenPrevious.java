// package Week3.CountOfElementsGraterThenPrevious;

import java.util.Scanner;

public class CountOfElementsGraterThenPrevious {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int counter = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[i - 1]) {
                counter++;
            }
        }
        System.out.println(counter);
        sc.close();
    }
}
