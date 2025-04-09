// package Week3.DoubleReverse;

import java.util.Scanner;

public class DoubleReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];
        for(int i = 0; i < l; i++) {
            arr[i] = i+1;
        }

        int a = sc.nextInt() - 1;
        int b = sc.nextInt() - 1;
        int c = sc.nextInt() - 1;
        int d = sc.nextInt() - 1;
        //     a b
        //[1 5 4 3 2 6 7 8 9]
        //t = 3
        while(a < b) {
            int t = arr[a];
            arr[a] = arr[b];
            arr[b] = t;
            a++;
            b--;
        }
        while(c < d) {
            int t = arr[c];
            arr[c] = arr[d];
            arr[d] = t;
            c++;
            d--;
        }
        for(int i = 0; i < l; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
