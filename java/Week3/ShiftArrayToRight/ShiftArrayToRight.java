// package Week3.ShiftArrayToRight;

// import java.util.Arrays;
import java.util.Scanner;

public class ShiftArrayToRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int lastEl = arr[l - 1];
        for(int i = l-1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastEl;

        for(int i = 0; i < l; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
