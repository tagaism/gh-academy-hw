package Week3.Balls;

import java.util.Scanner;

public class Balls {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];
        for(int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ballsMap = new int[10];

        boolean flg = true;
        while(flg) {
            int c = 1;
            int prev = -1;
            for(int i = 0; i < l; i++) {
                if(arr[i] == prev) {
                    c++;
                }
            }
        }


        sc.close();
    }
}
