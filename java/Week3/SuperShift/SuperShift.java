// package Week3.SuperShift;

import java.util.Scanner;

public class SuperShift {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];
        for(int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        int step = sc.nextInt();
        sc.close();
        
        int shiftStep = step % l; //since step could be bigger then the arr.length
        if(step < 0) {
            shiftStep += l;
        }

        if(shiftStep != 0) {
            reverse(arr, 0, l - 1);
            reverse(arr, 0, shiftStep - 1);
            reverse(arr, shiftStep, l - 1);
        }
        
        for(int k = 0; k < l; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    private static void reverse(int[] ar, int f, int l) {
        while(f < l) {
            int t = ar[f];
            ar[f] = ar[l];
            ar[l] = t;
            f++;
            l--;
        }
    }
}
