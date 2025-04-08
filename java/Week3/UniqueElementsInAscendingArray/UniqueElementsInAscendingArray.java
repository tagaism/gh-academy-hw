// package Week3.UniqueElementsInAscendingArray;

import java.util.Scanner;

public class UniqueElementsInAscendingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];
        for(int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }

        int c = 1;
        for(int i = 1; i < l; i++) {
            if(arr[i - 1] != arr[i]) {
                c++;
            }
        }
        System.out.println(c);
        sc.close();
    }
}
