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
        sc.close();

        int position = 1;
        for(int i = 0; i < l; i++) {
            if(arr[i] >= pHeight) {
                position++;
            } else {
                break;
            }
        }
        System.out.println(position);
    }
}
