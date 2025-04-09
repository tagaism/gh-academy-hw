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
        //reverse arr
        int i = 0;
        int j = l - 1;
        while(i < j) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
        int step = sc.nextInt();
        int a, b, c, d;
        a = 0;
        d = l - 1;
        if(step > 0) {
            b = step - 1;
            c = step;
        } else {
            b = l + step - 1;
            c = l + step;
        }
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

        for(int k = 0; i < l; k++) {
            System.out.print(arr[k] + " ");
        }
        sc.close();
    }
}
