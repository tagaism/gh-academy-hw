// package Week3.PeteNumber;

import java.util.Scanner;

public class PeteNumber {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];
        for(int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        int pHeight = sc.nextInt();

        boolean theLowest = true;
        for(int i = 0; i < l; i++) {
            if(pHeight > arr[i]) {
                System.out.println(i + 1);
                theLowest = false;
                break;
            }
        }
        if(theLowest) {
            System.err.println(arr.length + 1);
        }
        sc.close();
    }
}
