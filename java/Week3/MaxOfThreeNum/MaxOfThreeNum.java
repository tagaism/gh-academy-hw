//package Week3.MaxOfThreeNum;

import java.util.Scanner;

public class MaxOfThreeNum {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int a = sc.nextInt();
        if(a > max) {
            max = a;
        }
        int b = sc.nextInt();
        if(b > max) {
            max = b;
        }
        int c = sc.nextInt();
        if(c > max) {
            max = c;
        }
        System.out.println(max);
        sc.close();
    }
}
